import React, { Component } from 'react'
import './App.css'
import Header from './components/Header'
import Survey from './components/Survey'
import SurveyList from './components/SurveyList'
import Video from './components/Video'


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
    axios.get(`/surveys/${id}`)
     .then(res => this.setState({ survey: res.data }))
  }
 
  addSurvey = (survey) => {
    axios.post('/surveys/addSurveys', {survey})
    .then(res => this.setState({ surveys: res.data}))
  }

  submitSurvey = (name, questions) => {
    console.log(questions)
    axios.post('/surveys/submit', {name, questions})
  }

  updateCurrentLocation = (location) => (
    this.setState({ currentLocation: location})
  )

  render() {
    return (
      <div className="App">  
        <Header updateCurrentLocation = {this.updateCurrentLocation} />
        {this.state.currentLocation === 'survey' && this.state.survey && <Survey survey={this.state.survey} submitSurvey={this.submitSurvey} />} 
        {this.state.currentLocation === 'survey' && !this.state.survey &&  <SurveyList surveys = {this.state.surveys} setSurveyById={this.setSurveyById} />}  
        {this.state.currentLocation === 'video' && <Video />}
      </div>)
  }
}

export default App;
