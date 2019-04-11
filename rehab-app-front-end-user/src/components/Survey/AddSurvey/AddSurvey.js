import React, { Component } from "react";
import QuestionList from './QuestionList';
import QuestionChoiceList from './QuestionChoiceList'
import axios from "axios"

export default class AddSurvey extends Component {

  state = {
    questions: [],
    questionChoices: []
  };

  componentDidMount() {
    axios.get("/questions").then(res => this.setState({ questions: res.data }));
  }

  addQuestionChoiceButton = () => {
    let selectBox = document.querySelector(".questionListChoice")
    let questionId = selectBox.options[selectBox.selectedIndex].value;
    let questionName = selectBox.options[selectBox.selectedIndex].textContent;
    this.addQuestionChoice(questionId, questionName)
  }

  addQuestionChoice = (id, name) => {
    this.setState({
      questionChoices: [...this.state.questionChoices, {
        id: id,
        name: name,
      }]
    })
  }

  removeQuestionChoice = (specificQuestionName) => {
    this.setState({
      questionChoices: [...this.state.questionChoices.filter(questionChoice => questionChoice.name !== specificQuestionName)]
    })
  }

  addSurveyButton = () => {
    let name = document.querySelector(".surveyName-input").value


    this.props.addSurvey(name, this.state.questionChoices);
  };

  render() {
    return (
      <div className="renderContainer">
        <div className="survey">
          <h1 className="addSurveyTitle">Add Survey</h1>
          <div className="surveyName">
            <p>Survey Name:</p>
            <input className="surveyName-input" type="text" placeholder="Survey Name"></input>
          </div>

          <div className="questionBox">
            <QuestionList questions={this.state.questions} addQuestionChoice={this.addQuestionChoice}
              questionChoices={this.state.questionChoices}
            />
            <button
              className="genericButton"
              onClick={() => this.addQuestionChoiceButton()}
            >Add Question Choice
            </button>
          </div>
          <QuestionChoiceList questionChoices={this.state.questionChoices} removeQuestionChoice = {this.removeQuestionChoice} />

          <div className="btnContainer">
            <button
              className="genericButton"
              onClick={() => this.addSurveyButton()}
            >Submit Survey
              </button>
          </div>

        </div>
      </div>
    );
  }
}
