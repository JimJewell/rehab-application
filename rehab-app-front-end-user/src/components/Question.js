import React, { Component } from 'react'

export default class Question extends Component {
  state = {
    i: -1
  }
  render() {
    return (
      <div className='questionDiv' style={divStyle}>


        <h5 className='questionName' >{this.props.question.name}</h5>
        <select className='questionValue' >
          {this.props.question.answerChoices.map((answer) => {
            {this.setState({i:i+1})}
            return (
              <option value={this.state.i}>{answer}</option>
            )
          })}
        </select>


      </div>
    )
  }
}

const divStyle = {
  display: 'flex'
}
