import React, { Component } from "react";
import AddSurvey from "./Survey/AddSurvey/AddSurvey";

export default class ProDashboard extends Component {
  render() {
    return (
      <div className="proSplashBacker">
        <div className="homeLogoBack">
          <div className="proTasks">
            <h1>Good Morning, Doctor Fry</h1>
            <AddSurvey addSurvey={this.addSurvey} />
          </div>
        </div>

        <div />
      </div>
    );
  }
}
