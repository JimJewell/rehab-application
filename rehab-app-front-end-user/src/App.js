import React, { Component } from 'react'
import './App.css'
import Survey from './components/Survey'
import SurveyList from './components/SurveyList'

import axios from 'axios';


class App extends Component {
  state = {
    surveys: [],
    survey: {}
  }

  componentDidMount() {
    axios.get('/surveys')
      .then(res => this.setState({ surveys: res.data }))
  }

  setSurveyById = (id) => {
    axios.get(`/surveys/${id}`)
     .then(res => this.setState({ survey: res.data }))
  }

  render() {
    return (this.state.survey == {}) ? 
          (
            <div className="App">  
            {/* {console.log( this.state.survey) }    */}
                <Survey survey={this.state.survey} />
            </div>
          ) :
          ( <div className="App">
          <h1>Pick a survey</h1>  
            <SurveyList surveys = {this.state.surveys} setSurveyById = {this.setSurveyById} />
            {console.log( this.state.survey) }
          </div>) ;
  }
}

export default App;
