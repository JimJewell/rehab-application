import React, { Component } from "react";

export default class SelectDifficulty extends Component {
  render() {
    return this.props.answerChoices.map(answer => (
      <option value={answer.value}>{answer.answerChoice}</option>
    ));
  }
}
