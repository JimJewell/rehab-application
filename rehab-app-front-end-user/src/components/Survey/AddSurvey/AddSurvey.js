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

  addQuestionChoice = (id, name) => {
    this.setState({ questionChoices: [...this.state.questionChoices, {
      id: id, 
      name: name,
    }]})

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
          <QuestionList questions = {this.state.questions} addQuestionChoice = {this.addQuestionChoice}
          questionChoices = {this.state.questionChoices}
          />
          <QuestionChoiceList questionChoices= {this.state.questionChoices} />
            
            <div className="btnContainer">
              <button
                className="genericButton"
                onClick={() => this.addSurveyButton()}
              >Submit
              </button>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
