import React, { Component } from 'react'
import SelectDifficulty from './SelectDifficulty';

export default class Question extends Component {
  render() {
    return (
      <div className='questionDiv' style={divStyle}>

        <h5 className='questionName' >{this.props.question.name}</h5>
        {console.log(this.props.question.answerChoices)}
        <select className='questionValue' >
        <SelectDifficulty answerChoices = {this.props.question.answerChoices} />
        </select>


      </div>
    )
  }
}

const divStyle = {
  display: 'flex'
}
