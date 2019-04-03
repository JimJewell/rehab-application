import React, { Component } from 'react'
import './App.css'
import Survey from './components/Survey'
import SurveyList from './components/SurveyList'

import axios from 'axios';


class App extends Component {
  state = {
    surveys: [],
    survey: undefined
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

  render() {
    return (
      <div className="App">  
                
        {this.state.survey && <Survey survey={this.state.survey} submitSurvey={this.submitSurvey} />}   
        {!this.state.survey &&  <SurveyList surveys = {this.state.surveys} setSurveyById = {this.setSurveyById} />}
             
      </div>)
  }
}

export default App;
