import React, { Component } from 'react'


export default class QuestionChoiceList extends Component {

  render() {
    return (
      <div className="questionDiv">
      <p>Questions</p>
        <ul>
        {this.props.questionChoices.map((questionChoices) => {
          return (<li>questionChoices.name</li>)
        })}
        </ul>
      </div>
    );
  }
}
