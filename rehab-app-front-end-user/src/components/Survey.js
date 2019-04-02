import React, { Component } from 'react'
import Question from './Question'
import Axios from 'axios';

export default class Survey extends Component { 

  
  // onSubmit = (e) => {
  //   e.preventDefault();
  //   Axios.post('/surveys/addSurvey', 
  //     )
  //   . 
  // }

  render() {
    return (
      <div>
        <form onSubmit={this.onSubmit}>
        <h1>{this.props.survey.name}</h1>
        {this.props.survey.questions.map((question) => (
            <Question key={question.id} question={question} />
        ))}
        <input  
          type="submit" 
          value="Submit" 
          className="btn"
          style={{flex: '1'}}
        />
        </form>
      </div>
    )
  }
}

