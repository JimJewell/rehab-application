import React, { Component } from 'react'


export default class QuestionChoiceList extends Component {
  addQuestionButton = () => {
    let name = document.querySelector(".addQuestion-name").value
    this.props.addQuestion(name);
  }

  render() {
    return (
      <div className="questionChoice-Div">
      <div>
        <p>Questions</p>
        <ul className="questionChoices-list">
          {this.props.questionChoices.map((questionChoice) => {
            return (
              <li>{questionChoice.name} <span className="questionChoice-X" onClick={() => this.props.removeQuestionChoice(questionChoice.name)}>X</span></li>
            )
          })}
        </ul>
      </div>
      <div>
        {this.props.addQuestionChecker && <div><input className="addQuestion-name" type="text" placeholder="Question Text"></input>
          <div className="btnContainer">
            <button
              className="genericButton"
              onClick={() => this.addQuestionButton()}
            >Add Question
              </button>
          </div>
        </div>}
        </div>
        </div>
    );
  }
}
