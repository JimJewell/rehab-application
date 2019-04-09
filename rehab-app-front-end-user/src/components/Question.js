import React, { Component } from "react";

export default class Question extends Component {
  render() {
    return (
      <div className="questionDiv">
        <h5 className="questionName">{this.props.question.name}</h5>

        <select className="questionValue">
          <option>Select Response</option>
          <option value="0">
            Extreme difficulty or unable to perform activity (0 points)
          </option>
          <option value="1">Quite a bit of difficulty (1 point)</option>
          <option value="2">Moderate difficulty (2 point)</option>
          <option value="3">A little bit of difficulty (3 point)</option>
          <option value="4">No difficulty (4 point)</option>
        </select>
      </div>
    );
  }
}
