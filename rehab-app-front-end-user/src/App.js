import React, { Component } from "react";
import "./App.css";
import Header from "./components/Header";
import Survey from "./components/Survey/Survey";
import SurveyList from "./components/Survey/SurveyList";
import Videos from "./components/Videos";

import AddSurvey from "./components/Survey/AddSurvey/AddSurvey";
import ProgressChart from "./components/ProgressChart";

import ProDashboard from "./components/ProDashboard";

import axios from "axios";
import Home from "./components/home";

class App extends Component {
  state = {
    surveys: [],
    survey: undefined,
    currentLocation: "survey",
    userType: "none",
    firstChecker: true
  };

  componentDidMount() {
    axios.get("/surveys").then(res => this.setState({ surveys: res.data }));
  }

  setSurveyById = id => {
    if (id === "all") {
      this.setState({ survey: undefined });
    } else {
      axios
        .get(`/surveys/${id}`)
        .then(res => this.setState({ survey: res.data }));
    }
  };

  addSurvey = (name, questionChoices) => {
    axios
      .post("/surveys/addSurvey", { name, questionChoices })
      .then(res => this.setState({ surveys: res.data }));
    this.setState({ currentLocation: "survey" });
  };

  submitSurvey = (name, questions) => {
    axios
      .post("/surveys/submit", { name, questions })
      .then(res => this.setState({ survey: res.data }));
    this.setState({ currentLocation: "video" });
  };

  setUserType = userType => {
    this.setState({ userType });
  };

  updateCurrentLocation = location =>
    this.setState({ currentLocation: location });

  render() {
    return (
      <div className="App">
        <Header
          updateCurrentLocation={this.updateCurrentLocation}
          userType={this.state.userType}
          setUserType={this.setUserType}
        />
        {this.state.userType === "none" && <Home />}
        {this.state.userType !== "none" && (
          <div>
            {this.state.userType === "professional" && (
              <div>
                {(this.state.currentLocation === "survey" ||
                  this.state.currentLocation === "video") && (
                  <ProDashboard
                    surveys={this.state.surveys}
                    setSurveyById={this.setSurveyById}
                  />
                )}

                {this.state.currentLocation === "surveyReport" && (
                  <div>
                    {this.state.survey && (
                      <ProgressChart survey={this.state.survey} />
                    )}
                    {!this.state.survey && (
                      <SurveyList
                        surveys={this.state.surveys}
                        setSurveyById={this.setSurveyById}
                      />
                    )}
                  </div>
                )}

                {this.state.currentLocation === "surveyList" && (
                  <SurveyList
                    surveys={this.state.surveys}
                    setSurveyById={this.setSurveyById}
                  />
                )}

                {this.state.currentLocation === "addSurvey" && (
                  <AddSurvey addSurvey={this.addSurvey} />
                )}
              </div>
            )}

            {this.state.userType === "patient" && (
              <div>
                {this.state.survey && (
                  <div className="chart">
                    <ProgressChart survey={this.state.survey} />
                  </div>
                )}
                {this.state.currentLocation === "survey" && (
                  <Survey
                    survey={this.state.survey}
                    submitSurvey={this.submitSurvey}
                  />
                )}
                {!this.state.survey &&
                  this.state.currentLocation === "video" && (
                    <Videos name="All" />
                  )}
                {this.state.survey &&
                  this.state.currentLocation === "video" && (
                    <Videos name={this.state.survey.name} />
                  )}
              </div>
            )}
          </div>
        )}
      </div>
    );
  }
}

export default App;
