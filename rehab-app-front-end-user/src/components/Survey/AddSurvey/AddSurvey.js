import React, { Component } from "react";
import QuestionList from './QuestionList';
import QuestionChoiceList from './QuestionChoiceList'
import axios from "axios"

export default class AddSurvey extends Component {

  state = {
    questions: [],
    questionChoices: [],
    addQuestionChecker: false
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
    { id === "add" && this.setState({ addQuestionChecker: true }) }
    { id !== "add" && (this.setState({
      questionChoices: [...this.state.questionChoices, {
        id: id,
        name: name,
      }]
    }))
    }

  }

  removeQuestionChoice = (specificQuestionName) => {
    this.setState({
      questionChoices: [...this.state.questionChoices.filter(questionChoice => questionChoice.name !== specificQuestionName)]
    })
  }

  addQuestion = name => {
    let newId
    axios
      .post("/questions/addQuestion", { name})
      .then(res => this.setState({ questions: res.data }))
      .then(() => {axios
      .post("/questions/nameToId", { name})
        .then(res => {newId = res.data })})
      .then(() => {
        console.log(newId)
        this.setState({
        questionChoices: [...this.state.questionChoices, {
          id: newId,
          name: name,
        }],
        addQuestionChecker: false
       })})
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
            <div className="btnContainer">
              <button
                className="genericButton"
                onClick={() => this.addQuestionChoiceButton()}
              >Add Question Choice
              </button>
            </div>
          </div>
          <QuestionChoiceList questionChoices={this.state.questionChoices} removeQuestionChoice={this.removeQuestionChoice} addQuestionChecker={this.state.addQuestionChecker} addQuestion = {this.addQuestion} />

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
