import React, { Component } from 'react'
import './App.css'
import Header from './components/Header'
import Survey from './components/Survey'
import SurveyList from './components/SurveyList'

import Videos from  './components/Videos'

import axios from 'axios';



class App extends Component {
  state = {
    surveys: [],
    survey: undefined,
    currentLocation: 'survey'
  }

  componentDidMount() {
    axios.get('/surveys')
      .then(res => this.setState({ surveys: res.data }))
  }

  setSurveyById = (id) => {
    if (id === 'all'){
      this.setState({ survey: undefined})
    } else {
    axios.get(`/surveys/${id}`)
     .then(res => this.setState({ survey: res.data }))
    }
  }
 
  addSurvey = (survey) => {
    axios.post('/surveys/addSurveys', {survey})
    .then(res => this.setState({ surveys: res.data}))
  }

  submitSurvey = (name, questions) => {
    axios.post('/surveys/submit', {name, questions})
    this.setState({currentLocation: 'video'})
  }

  updateCurrentLocation = (location) => (
    this.setState({ currentLocation: location})
  )

  render() {
    return (
      <div className="App">  
        <Header updateCurrentLocation = {this.updateCurrentLocation} />
        <SurveyList surveys = {this.state.surveys} setSurveyById={this.setSurveyById} />  
        {this.state.currentLocation === 'survey' && this.state.survey && <Survey survey={this.state.survey} submitSurvey={this.submitSurvey} />} 

        {!this.state.survey && this.state.currentLocation === 'video' && <Videos name='All' />}
        {this.state.survey && this.state.currentLocation === 'video' && <Videos name={this.state.survey.name} />}
        </div>)
  }
}

export default App;
