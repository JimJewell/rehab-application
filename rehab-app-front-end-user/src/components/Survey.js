import React, { Component } from "react";
import Question from "./Question";

export default class Survey extends Component {
  submitSurveyButton = () => {
    const name = this.props.survey.name;
    let questions = [];

    const questionDivs = document.querySelectorAll(".questionDiv");

    for (const questionDiv of questionDivs) {
      questions.push({
        name: questionDiv.querySelector(".questionName").textContent,
        value: questionDiv.querySelector(".questionValue").value
      });
    }
    this.props.submitSurvey(name, questions);
  };

  render() {
    return (
      <div className="renderContainer">
        <div className="survey">
          <h1 className="surveyTitle">{this.props.survey.name}</h1>
          <div className="questionBox">
            {this.props.survey.questions.map(question => (
              <Question key={question.id} question={question} />
            ))}
          </div>
          <button
            className="genericButton"
            onClick={() => this.submitSurveyButton()}
          >
            Submit
          </button>
        </div>
      </div>
    );
  }
}
