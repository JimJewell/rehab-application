import React, { Component } from "react";
import SurveyList from "../components/Survey/SurveyList"

export default class ProDashboard extends Component {
  render() {
    return (
      <div className="proSplashBacker">
        <div className="homeLogoBack">
          <div className="proTasks">
            <h1>Good Morning, Doctor Fry</h1>
            <SurveyList
                surveys={this.props.surveys}
                setSurveyById={this.props.setSurveyById}
              />
          </div>
        </div>

        <div />
      </div>
    );
  }
}
