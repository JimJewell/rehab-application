import React, { Component } from 'react'

export class SurveyList extends Component {

  render() {
    return (
      <div>
        <form onSubmit = {this.props.SurveySelect}>    
        <select>
        
        {this.props.surveys.map((survey) => (
           <option value={survey}>{survey.name}</option>
        ))}
        
        </select>

        <input  
        type="submit" 
        value="Submit" 
        className="btn"
        style={{flex: '1'}}
      />
      </form>
      </div>
    )
  }
}

export default SurveyList
