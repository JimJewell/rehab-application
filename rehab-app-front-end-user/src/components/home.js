import React, { Component } from "react";
import Image from "./images/background500.jpg";

export default class Home extends Component {
  render() {
    return (
      <div>
        <div className="splashBacker">
          <img
            className="homelogo"
            src={require("./images/rehabititfulllogo.png")}
          />
        </div>
      </div>
    );
  }
}
