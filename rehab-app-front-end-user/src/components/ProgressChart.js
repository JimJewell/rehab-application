import React, { Component } from 'react'
var Chart = require("chart.js");

export default class ProgressChart extends Component {

    constructor(props) {
        super(props)
        this.state = {
            type: 'line',
            data: {
                labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                datasets: [{
                    label: 'Users Progress',
                    data: this.props.survey.sums,
                    backgroundColor: [
                        'rgba(255, 99, 132, 0.2)',
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)',
                        'rgba(75, 192, 192, 0.2)',
                        'rgba(153, 102, 255, 0.2)',
                        'rgba(255, 159, 64, 0.2)'
                    ],
                    borderColor: [
                        'rgba(255, 99, 132, 1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)',
                        'rgba(75, 192, 192, 1)',
                        'rgba(153, 102, 255, 1)',
                        'rgba(255, 159, 64, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    yAxes: [{
                        ticks: {
                            beginAtZero: true
                        }
                    }]
                }
            },
            chartStyle: {
                width: '100',
                height: '100'
            }
        }
    }

    componentDidMount() {
        var ctx = document.getElementById('myChart');
        var myChart = new Chart(ctx, {...this.state})
    }

    render() {
        return (
            <div>
                <canvas id="myChart" style={this.state.chartStyle}></canvas>
            </div>
        )
    }
}