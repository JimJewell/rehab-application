import React, { Component } from 'react'
import Question from './Question'

export default class Survey extends Component {
    
  render() {
    return (
      <div>
            {this.props.questions.map((question) => (
                <Question question={question} />
            ))}
      </div>
    )
  }
}

