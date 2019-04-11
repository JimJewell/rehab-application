import React, { Component } from 'react'
import { QuestionListChoice } from './QuestionListChoice';


export default class QuestionList extends Component {


  addQuestionChoice = () => {
    let selectBox = document.querySelector(".questionListChoice")
    let questionId = selectBox.options[selectBox.selectedIndex].value;
    let questionName = selectBox.options[selectBox.selectedIndex].textContent;
    this.props.addQuestionChoice(questionId, questionName)

  }
  render() {
    return (
      <div className="questionDiv">
      <p>Questions</p>
        <select className='questionListChoice' onChange={() => this.addQuestionChoice()}>
        <QuestionListChoice questions = {this.props.questions} />
      
        </select>
      </div>
    );
  }
}
