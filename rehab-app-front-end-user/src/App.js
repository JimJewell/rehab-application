import React, { Component } from 'react'
import './App.css'
import Header from './components/Header'
import Survey from './components/Survey'
import SurveyList from './components/SurveyList'
import ProgressChart from './components/ProgressChart'

import NeckAssessmentVideos from './components/videos/NeckAssessmentVideos'
import LowBackPainVideos from './components/videos/LowBackPainVideos';

import axios from 'axios';
import LowerExtremedyVideos from './components/videos/LowerExtremedyVideos';
import PhysicalFunctionVideos from './components/videos/PhysicalFunctionVideos';


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
    axios.post('/surveys/submit', {name, questions})
  }

  updateCurrentLocation = (location) => (
    this.setState({ currentLocation: location})
  )

  render() {
    return (
      <div className="App">  
        <Header updateCurrentLocation = {this.updateCurrentLocation} />

        {this.state.survey && <ProgressChart survey={this.state.survey}/>}


        {this.state.currentLocation === 'survey' && this.state.survey && <Survey survey={this.state.survey} submitSurvey={this.submitSurvey} />} 
        {this.state.currentLocation === 'survey' && !this.state.survey &&  <SurveyList surveys = {this.state.surveys} setSurveyById={this.setSurveyById} />}  

        {this.state.survey && this.state.survey.name === 'Neck Assessment' && <NeckAssessmentVideos />}
        {this.state.survey && this.state.survey.name === 'Low Back Pain Assessment' && <LowBackPainVideos />}
        {this.state.survey && this.state.survey.name === 'Lower Extremity Assessment' && <LowerExtremedyVideos />}
        {this.state.survey && this.state.survey.name === 'Physical Function Assessment' && <PhysicalFunctionVideos />}
        {this.state.survey && this.state.survey.name === 'Upper Extremity Assessment' && <NeckAssessmentVideos />}
      </div>)
  }
}

export default App;
