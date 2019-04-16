import React, { Component } from "react";
import QuestionList from './QuestionList';
import QuestionChoiceList from './QuestionChoiceList'
import axios from "axios"

export default class AddSurvey extends Component {
  constructor(props) {
    super(props);
    this.updateQuestionOptions = this.updateQuestionOptions.bind(this);
    this.setState = this.setState.bind(this);
    this.state = {
      questions: [],
      questionOptions: [],
      questionChoices: [],
      addQuestionChecker: false
    };
  
  }

  componentDidMount() {
    axios.get("/questions").then(res => this.setState({ questions: res.data }))
    .then(() => this.setQuestionOptions())
  }

  setQuestionOptions = () => {
    this.setState({questionOptions: [...this.state.questions.map(question => {
      return {id : question.id, name : question.name};
    })]})
  }

  updateQuestionOptions = (specificQuestionName) => {
    this.setState({
      questionOptions: [...this.state.questionOptions.filter(questionOption => questionOption.name !== specificQuestionName)]
    })
  }

  addQuestionChoiceButton = () => {
    let selectBox = document.querySelector(".questionListChoice")
    let questionId = selectBox.options[selectBox.selectedIndex].value;
    let questionName = selectBox.options[selectBox.selectedIndex].textContent;
    Promise.all([this.addQuestionChoice(questionId, questionName)
      ])
      .then(this.updateQuestionOptions(questionName))
  }

  addQuestionChoice = (id, name) => {
    { id === "add" && this.setState({ addQuestionChecker: true }) }
    { id !== "add" && (this.setState({
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
          {console.log("choiceId " + this.state.questionChoiceIds)}
          {console.log("choice " + this.state.questionChoices)}
          {console.log("options " + this.state.questionOptions)}
            <QuestionList questions={this.state.questionOptions} addQuestionChoice={this.addQuestionChoice}
            />
            <div className="btnContainer">
              <button
                className="genericButton"
                onClick={() => (this.addQuestionChoiceButton())}
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
