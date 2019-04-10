import React, { Component } from "react";
import Image from "./images/background500.jpg";

export default class Home extends Component {
  render() {
    return (
      <div>
        <div className="splashBacker">
          <div className="login">
            <p>Medical Professionals</p>
            <button className="genericButton">Sign-In</button>
            <p>Patients</p>
            <button
              className="genericButton"
              onClick={() => this.patientLogin()}
            >
              Sign-In
            </button>
          </div>
        </div>
      </div>
    );
  }
}
