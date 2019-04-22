import React, { Component } from "react";
import { Line } from "react-chartjs";
//let LineChart = require('react-chartjs').Line

export default class ProgressChart extends Component {
  render() {
    var data = {
      labels: this.props.survey.surveys.map(survey => {
        return survey.date;
      }),
      datasets: [
        {
          label: "My First dataset",
          fillColor: "#7ebc59",
          strokeColor: "#368cbf",
          pointColor: "#33363b",
          pointStrokeColor: "#fff",
          pointHighlightFill: "#fff",
          pointHighlightStroke: "rgba(220,220,220,1)",
          data: this.props.survey.sums
        }
      ]
    };
    return <Line data={data} margin-top="70" redraw width="600" height="200" />;
  }
}
