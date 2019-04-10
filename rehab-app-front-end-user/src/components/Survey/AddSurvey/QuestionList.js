import React, { Component } from 'react'
import { QuestionListChoice } from './QuestionListChoice';


export default class QuestionList extends Component {
  render() {
    return (
      <div className="questionDiv">
      
        <select className='questionListChoice' onChange={() => this.selectQuestion}>
        <QuestionListChoice questions = {this.props.questions} />
        </select>
      </div>
    );
  }
}
