import React, { Component } from 'react'
import './App.css'
import Survey from './components/Survey'


class App extends Component {
  state = {
    categories: []
  }

  componentDidMount() {
    fetch("/questions")
        .then(response => response.json())
        .then(response => console.log(response))
        .then(data => {
          this.setState({categories: data})
        })
        .catch(err => console.log(err))
  }

  render() {
    return (
      <div className="App">
          <h1>test</h1>
          <Survey questions={this.state.questions} />
      </div>
    );
  }
}

export default App;
