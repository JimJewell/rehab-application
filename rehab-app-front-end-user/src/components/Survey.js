import React, { Component } from 'react'
import Question from './Question'


export default class Survey extends Component { 

  render() {
    return (
      <div>
       
        <h1>{this.props.survey.name}</h1>
        {this.props.survey.questions.map((question) => (
            <Question key={question.id} question={question} />
        ))}
        <button style={buttonStyle}>Submit</button>
        
      </div>
    )
  }
}

const buttonStyle = {
  flex: '1'
}

