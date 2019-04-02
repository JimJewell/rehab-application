import React, { Component } from 'react'
import Question from './Question'


export default class Survey extends Component { 

  
 onClick = () => {

 }

  render() {
    return (
      <div>
       
        <h1>{this.props.survey.name}</h1>
        {this.props.survey.questions.map((question) => (
            <Question key={question.id} question={question} />
        ))}
        <input  
          type="submit" 
          value="Submit" 
          className="btn"
          onClick={this.onClick()}
          style={{flex: '1'}}
        />
        
      </div>
    )
  }
}

