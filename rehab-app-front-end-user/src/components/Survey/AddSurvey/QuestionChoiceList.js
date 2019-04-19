import React, { Component } from "react";

export default class QuestionChoiceList extends Component {
  addQuestionButton = () => {
    let name = document.querySelector(".addQuestion-name").value;
    this.props.addQuestion(name);
  };

  render() {
    return (
      <div className="questionChoice-Div">
        <div>
          <p>Question(s) Selected</p>
          <ul className="questionChoices-list">
            {this.props.questionChoices.map(questionChoice => {
              return (
                <li>
                  {questionChoice.name}{" "}
                  <span
                    className="questionChoice-X"
                    onClick={() =>
                      this.props.removeQuestionChoice(questionChoice.name)
                    }
                  >
                    X
                  </span>
                </li>
              );
            })}
          </ul>
        </div>
        
        {/* <div className="addQuestion-div">
          <input
            className="addQuestion-name"
            type="text"
            placeholder="Question Text"
          />
          <div>
            <h2>Answer Choices:</h2>
            <p>
              0:{" "}
              <input
                className="addQuestion-AnswerChoiceZero"
                type="text"
                placeholder="Answer Choice 0"
              />
            </p>
          </div>
          <div className="btnContainer">
            <button
              className="genericButton"
              onClick={() => this.addQuestionButton()}
            >
              Add Question
            </button>
          </div>
        </div> */}
      </div>
    );
  }
}
