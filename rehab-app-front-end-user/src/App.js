import React, { Component } from "react";
import "./App.css";
import Header from "./components/Header";
import Survey from "./components/Survey/Survey";
import SurveyList from "./components/Survey/SurveyList";
import Videos from "./components/Videos";
import AddSurvey from "./components/Survey/AddSurvey/AddSurvey";
import ProDashboard from "./components/ProDashboard";

import axios from "axios";
import Home from "./components/home";

class App extends Component {
  state = {
    surveys: [],
    survey: undefined,
    currentLocation: "survey",
    userType: "none"
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
    axios.post("/surveys/submit", { name, questions });
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
        {this.state.userType === "professional" && <ProDashboard />}
        {this.state.userType === "patient" && (
          <SurveyList
            surveys={this.state.surveys}
            setSurveyById={this.setSurveyById}
          />
        )}

        {this.state.currentLocation === "survey" && this.state.survey && (
          <Survey survey={this.state.survey} submitSurvey={this.submitSurvey} />
        )}

        {this.state.currentLocation === "addSurvey" && (
          <AddSurvey addSurvey={this.addSurvey} />
        )}

        {!this.state.survey && this.state.currentLocation === "video" && (
          <Videos name="All" />
        )}
        {this.state.survey && this.state.currentLocation === "video" && (
          <Videos name={this.state.survey.name} />
        )}
      </div>
    );
  }
}

export default App;
