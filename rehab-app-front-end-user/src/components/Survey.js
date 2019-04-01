import React, { Component } from 'react'
import PropTypes from 'prop-types'

export default class Survey extends Component {
  render() {
    return (
      <div>
        <form>
            return this.props.questions.map((question) => (
                <Question question={question} />
            ))
        </form>
      </div>
    )
  }
}


//PropTypes
Survey.propTypes = {
    questions: PropTypes.object.isRequired
}