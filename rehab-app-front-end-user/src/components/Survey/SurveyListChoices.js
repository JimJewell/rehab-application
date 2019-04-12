import React, { Component } from "react";

export class SurveyListList extends Component {
  render() {
    return this.props.surveys.map(survey => (
      <option value={survey.id}>{survey.name}</option>
    ));
  }
}

export default SurveyListList;
