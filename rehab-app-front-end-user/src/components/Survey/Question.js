import React, { Component } from "react";
import SelectDifficulty from "./SelectDifficulty";

export default class Question extends Component {
  render() {
    return (
      <div className="questionDiv">
        <h5 className="questionName">{this.props.question.name}</h5>
        <select className="questionValue">
          <option value="">--</option>
          <SelectDifficulty answerChoices={this.props.question.answerChoices} />
        </select>
      </div>
    );
  }
}
