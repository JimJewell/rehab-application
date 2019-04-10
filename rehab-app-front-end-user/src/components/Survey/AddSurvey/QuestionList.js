import React, { Component } from 'react'
import { QuestionListChoice } from './QuestionListChoice';


export default class QuestionList extends Component {


  addQuestionChoice = () => {
    let questionBox = document.querySelector('.questionListChoice')
    let questionId = questionBox.option[questionBox.selectedIndex].value;
    let questionName = questionBox.option[questionBox.selectedIndex].textContent;

    this.props.addQuestionChoice(questionId, questionName)

  }
  render() {
    return (
      <div className="questionDiv">
      <p>Questions</p>
        <select className='questionListChoice' onChange={() => this.addQuestionChoice}>
        <QuestionListChoice questions = {this.props.questions} />
        </select>
      </div>
    );
  }
}
