import React, { Component } from 'react'
import Question from './Question'


export default class Survey extends Component { 

  submitSurveyButton = () => {
    const name = this.props.survey.name
    let questions = []
    
    console.log(document.querySelectorAll('.questionDiv'))


    const sum = document.querySelectorAll('.questionDiv')

    for (const question of sum) {
      questions.push(
        {name: question.querySelector('.questionName').textContent,
        value: question.querySelector('.questionValue').value}
      )
    }
    this.props.submitSurvey(name, questions)
  }
    
  render() {
    return (
      <div>
       
        <h1>{this.props.survey.name}</h1>
        {this.props.survey.questions.map((question) => (
            <Question key={question.id} question={question} />
        ))}
        <button style={buttonStyle} onClick={() => this.submitSurveyButton()} >Submit</button>
        
      </div>
    )
  }
}

const buttonStyle = {
  flex: '1'
}
