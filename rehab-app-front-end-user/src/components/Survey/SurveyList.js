import React, { Component } from "react";
import SurveyListList from "./SurveyListChoices";

export class SurveyList extends Component {
  onSubmit = () => {
    const id = document.querySelector(".surveySelect").value;
    this.props.setSurveyById(id);
  };

  render() {
    return (
      <div className="renderContainer">
        <p className="professionalMessage">
          Please choose a survey for your patient to complete.
        </p>
        <select className="surveySelect">
          <option>Select Survey</option>
          <SurveyListList surveys={this.props.surveys} />
          <option value="all">No Survey</option>
        </select>

        <button
          className="genericButton"
          onClick={() => this.onSubmit()}
          style={buttonStyle}
        >
          submit
        </button>
      </div>
    );
  }
}

const buttonStyle = {
  flex: "1"
};

export default SurveyList;
