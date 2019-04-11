import React, { Component } from 'react'


export default class QuestionChoiceList extends Component {

  render() {
    return (
      <div className="questionChoice-Div">
      <p>Questions</p>
        <ul className="questionChoices-list">
        {this.props.questionChoices.map((questionChoice) => {
          return (<li>{questionChoice.name}</li>)
        })}
        </ul>
      </div>
    );
  }
}
