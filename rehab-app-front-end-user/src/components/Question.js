import React, { Component } from 'react'
import SelectDifficulty from './SelectDifficulty'

export default class Question extends Component {
  render() {
    return (
      <div style={divStyle}>

        <h5>{this.props.question.name}</h5>
        <SelectDifficulty />
        
      </div>
    )
  }
}

const divStyle = {
  display: 'flex'
}
