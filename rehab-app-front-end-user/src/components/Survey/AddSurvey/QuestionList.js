import React, { Component } from "react";
import { QuestionListChoice } from "./QuestionListChoice";

export default class QuestionList extends Component {
  render() {
    return (
      <div className="questionDiv">
        <p>Question Selection:</p>
        <select className="questionListChoice">
          <QuestionListChoice questions={this.props.questions} />
          {/* <option value="add">Add Question</option> */}
        </select>
      </div>
    );
  }
}
