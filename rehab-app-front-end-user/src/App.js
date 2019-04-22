import React, { Component } from "react";
import "./App.css";
import Header from "./components/Header";
import Survey from "./components/Survey/Survey";
import SurveyList from "./components/Survey/SurveyList";
import Videos from "./components/Videos";
import Scene from "./components/Scene"


import AddSurvey from "./components/Survey/AddSurvey/AddSurvey";
import ProgressChart from "./components/ProgressChart";

import ProDashboard from "./components/ProDashboard";
import Login from "./components/login";
import PatientLogin from "./components/patientLogin";
import axios from "axios";
import Home from "./components/home";

class App extends Component {
  state = {
    surveys: [],
    survey: undefined,
    currentLocation: "survey",
    userType: "none",
    firstChecker: true,
    showModal: false
  };

  componentDidMount() {
    axios.get("/surveys").then(res => this.setState({ surveys: res.data }));
  }

  toggleModal = () => {
    this.setState({
      showModal: !this.state.showModal
    });
  };

  setSurveyById = id => {
    if (id === "all") {
      this.setState({ survey: undefined });
    } else {
      axios
        .get(`/surveys/${id}`)
        .then(res => this.setState({ survey: res.data }));
    }
  };

  foo = () => {
    this.el.addEventListener("click", (e)=>{
      console.log('click')
    })
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
          toggleModal={this.toggleModal}
        />
        {this.state.userType === "none" && <Home />}
        {this.state.userType === "prologin" && (
          <Login
            updateCurrentLocation={this.updateCurrentLocation}
            userType={this.state.userType}
            setUserType={this.setUserType}
          />
        )}
        {this.state.userType === "patlogin" && (
          <PatientLogin
            updateCurrentLocation={this.updateCurrentLocation}
            userType={this.state.userType}
            setUserType={this.setUserType}
          />
        )}
        {this.state.userType !== "none" && (
          <div>
            {this.state.userType === "professional" && (
              <div>
                {(this.state.currentLocation === "survey" ||
                  this.state.currentLocation === "video") && (
                  <ProDashboard
                    location = {this.state.currentLocation}
                    surveys={this.state.surveys}
                    setSurveyById={this.setSurveyById}
                    assignChecker={true}
                    updateCurrentLocation={this.updateCurrentLocation}
                  />
                )}

                {this.state.currentLocation === "surveyReport" && (
                  <div>
                    {this.state.survey && (
                      <ProgressChart survey={this.state.survey} />
                    )}
                    {
                      <SurveyList
                        location = {this.state.currentLocation}
                        surveys={this.state.surveys}
                        setSurveyById={this.setSurveyById}
                        assignChecker={false}
                        updateCurrentLocation={this.updateCurrentLocation}
                      />
                    }
                  </div>
                )}

                {this.state.currentLocation === "surveyList" && (
                  <SurveyList
                    location = {this.state.currentLocation}
                    surveys={this.state.surveys}
                    setSurveyById={this.setSurveyById}
                    assignChecker={true}
                    updateCurrentLocation={this.updateCurrentLocation}
                  />
                )}

                {this.state.currentLocation === "addSurvey" && (
                  <AddSurvey addSurvey={this.addSurvey} />
                )}
              
              </div>
            )}

            {this.state.userType === "patient" && (
              <div>
                {this.state.survey && this.state.currentLocation !== "scene" && (
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
                {this.state.currentLocation === "scene" && <Scene />}

              </div>
            )}
          </div>
        )}
      </div>
    );
  }
}

export default App;