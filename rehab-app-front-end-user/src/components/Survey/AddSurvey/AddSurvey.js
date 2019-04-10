import React, { Component } from "react";
import QuestionList from './QuestionList';


export default class AddSurvey extends Component {

  state = {
    questions: [],
    questionChoice: []
  
  
  
  };


  componentDidMount() {
    axios.get("/questions").then(res => this.setState({ questions: res.data }));
  }

  
  addSurveyButton = () => {
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
          <h1 className="addSurveyTitle">Add Survey</h1>
          <div className="surveyName">
          <p>Survey Name:</p>
          <input type="text" placeholder="Survey Name"></input>
          </div>

          <div className="questionBox">
          <p>Questions</p>
          
          <QuestionList questions = {this.state.questions}
          />
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
      </div>
    );
  }
}
