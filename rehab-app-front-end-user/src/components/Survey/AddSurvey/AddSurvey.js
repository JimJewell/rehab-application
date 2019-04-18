import React, { Component } from "react";
import QuestionList from './QuestionList';
import QuestionChoiceList from './QuestionChoiceList'
import axios from "axios"

export default class AddSurvey extends Component {
  constructor(props) {
    super(props);
    this.removeQuestionOption = this.removeQuestionOption.bind(this);
    this.addQuestionOption = this.addQuestionOption.bind(this);
    this.addQuestionChoice = this.addQuestionChoice.bind(this);
    this.removeQuestionChoice = this.removeQuestionChoice.bind(this);
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
    this.setState({questionOptions: [...this.state.questions]})
  }

  removeQuestionOption = (specificQuestionName) => {
    this.setState({
      questionOptions: [...this.state.questionOptions.filter(questionOption => questionOption.name !== specificQuestionName)]
    })
  }

  addQuestionOption = (specificQuestionName) => {
    this.setState({
      questionOptions: [...this.state.questionOptions, this.state.questions.filter(question => question.name == specificQuestionName)[0]]
    })
  }

  addQuestionChoiceButton = () => {
    let selectBox = document.querySelector(".questionListChoice")
    let questionName = selectBox.options[selectBox.selectedIndex].textContent;
    Promise.all([this.addQuestionChoice(questionName)
      ])
      .then(this.removeQuestionOption(questionName))
  }

  addQuestionChoice = (specificQuestionName) => {
    this.setState({
      questionChoices: [...this.state.questionChoices, 
        this.state.questions.filter(question => question.name == specificQuestionName)[0]]
    })
  }

  removeQuestionChoice = (specificQuestionName) => {
    Promise.all([this.setState({
      questionChoices: [...this.state.questionChoices.filter(questionChoice => questionChoice.name !== specificQuestionName)]
    })])
    .then(this.addQuestionOption(specificQuestionName))
    
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
          <QuestionChoiceList questionChoices={this.state.questionChoices} removeQuestionChoice={this.removeQuestionChoice} addQuestionChecker={this.state.addQuestionChecker}/>

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
