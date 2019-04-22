import React, { Component } from "react";
import SurveyListList from "./SurveyListChoices";
import ProgressChart from "../ProgressChart";

export class SurveyList extends Component {
  onSubmit = () => {
    const id = document.querySelector(".surveySelect").value;
    this.props.setSurveyById(id)
    this.props.updateCurrentLocation("surveyReport")
  };

  render() {
    return (
      <div className="renderContainer">
        {(this.props.location === "survey" ||
          this.props.location === "video" ||
          this.props.location === "surveyList") && <p className="professionalMessage">
          Please choose a survey for your patient to complete.
        </p>}
        
        <select className="surveySelect">
          <option>Select Survey</option>
          <SurveyListList surveys={this.props.surveys} />
          <option value="all">No Survey</option>
        </select>

        <button
          className="genericButton"
          onClick={() => this.onSubmit()}
          style={buttonStyle}>
          Submit
        </button>

        {this.props.survey && <ProgressChart survey={this.props.survey}/>} 

      </div>
    );
  }
}

const buttonStyle = {
  flex: "1"
};

export default SurveyList;
