import React, { Component } from 'react'
import './App.css'
import Survey from './components/Survey'
import SurveyList from './components/SurveyList'

import axios from 'axios';


class App extends Component {
  state = {
    surveys: [],
    survey: ''
  }

  componentDidMount() {
    axios.get('/surveys')
      .then(res => this.setState({ surveys: res.data }))
  }

  SurveySelect = (survey) => {
    this.setState({ survey})
}

  render() {
    return this.state.surveyId ? 
          (
            <div className="App">       
                <Survey survey={this.state.survey} />
            </div>
          ) :
          ( <div className="App">
          <h1>Pick a survey</h1>  
            <SurveyList survey = {this.state.surveys} surveySelect = {this.SurveySelect} />
          </div>) ;
  }
}

export default App;
