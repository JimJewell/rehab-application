import React, { Component } from "react";

export default class Home extends Component {
  render() {
    return (
      <div>
        <div className="splashBacker">
          <div className="homeLogoBack">
            <img
              className="homelogo"
              src={require("./images/logoshadow.png")}/>
            <h3 className="pitch">
              "Our goal is to provide a tool to help Medical Professionals and
              Patients to use data to focus efforts in ensuring people recover
              quicker and with better outcomes, while reducing medical costs."
            </h3>
          </div>
        </div>
      </div>
    );
  }
}
