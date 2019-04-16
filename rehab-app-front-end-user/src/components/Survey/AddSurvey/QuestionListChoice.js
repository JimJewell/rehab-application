import React, { Component } from 'react'

export class QuestionListChoice extends Component {
  render() {
    return this.props.questions.map((question) => (
           <option value={question.id}>{question.name}</option>
        ))
  }
}


