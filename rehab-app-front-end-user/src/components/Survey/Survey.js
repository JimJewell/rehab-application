import React, { Component } from "react";
import Question from "../Survey/Question";

export default class Survey extends Component {
  submitSurveyButton = () => {
    const name = this.props.survey.name;
    let questions = [];

    let emptyChoice = true;
    const questionDivs = document.querySelectorAll(".questionDiv");
    for (const questionDiv of questionDivs) {
      questions.push({
        name: questionDiv.querySelector(".questionName").textContent,
        value: questionDiv.querySelector(".questionValue").value
      });
      if (questionDiv.querySelector(".questionValue").value === "") {
        emptyChoice = false;
      }
    }

    if (emptyChoice == false) {
      alert("Please answer all questions");
    } else {
      this.props.submitSurvey(name, questions);
    }
  };

  render() {
    return (
      <div className="renderContainer">
        {!this.props.survey && <h2>No Surveys to Complete</h2>}
        {this.props.survey && (
          <div className="survey">
            <p className="patientMessage">
              Your Care Provider has assigned you a survey to complete. Please
              complete it by the due date.
            </p>
            <br />
            <h1 className="surveyTitle">{this.props.survey.name}</h1>
            <div className="questionBox">
              {this.props.survey.questions.map(question => (
                <Question key={question.id} question={question} />
              ))}
              <div className="btnContainer">
                <button
                  className="genericButton"
                  onClick={() => this.submitSurveyButton()}
                >
                  {" "}
                  Submit
                </button>
              </div>
            </div>
          </div>
        )}
      </div>
    );
  }
}
