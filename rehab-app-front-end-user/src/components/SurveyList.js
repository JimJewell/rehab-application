import React, { Component } from 'react'
import SurveyListList from './SurveyListList'

export class SurveyList extends Component {

    onSubmit = () => {
        const id = document.querySelector(".surveySelect").value
        this.props.setSurveyById(id);
        }

    onChange = (e) => this.setState({ [e.target.name]: e.target.value });

  render() {
    return (
      <div>   
            <select name="surveyId" className = "surveySelect" onChange={this.onChange}>          
                <SurveyListList surveys= {this.props.surveys} />
            </select>

            <input  
            type="submit" 
            value="Submit" 
            className="btn"
            style={{flex: '1'}}
            onClick = {() => this.onSubmit()}
            />
      </div>
    )
  }
}

export default SurveyList
