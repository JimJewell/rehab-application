import React, { Component } from 'react'
import {Line} from 'react-chartjs'
//let LineChart = require('react-chartjs').Line

    
export default class ProgressChart extends Component {

    // constructor(props) {
    //     super(props)
    //     this.state = {
    //         // type: 'line',
    //         // data: {
    //         //     //labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
    //         //     datasets: [{
    //         //         label: 'Users Progress',
    //         //         data: this.props.sums,
    //         //         backgroundColor: [
    //         //             'rgba(255, 99, 132, 0.2)',
    //         //             'rgba(54, 162, 235, 0.2)',
    //         //             'rgba(255, 206, 86, 0.2)',
    //         //             'rgba(75, 192, 192, 0.2)',
    //         //             'rgba(153, 102, 255, 0.2)',
    //         //             'rgba(255, 159, 64, 0.2)'
    //         //         ],
    //         //         borderColor: [
    //         //             'rgba(255, 99, 132, 1)',
    //         //             'rgba(54, 162, 235, 1)',
    //         //             'rgba(255, 206, 86, 1)',
    //         //             'rgba(75, 192, 192, 1)',
    //         //             'rgba(153, 102, 255, 1)',
    //         //             'rgba(255, 159, 64, 1)'
    //         //         ],
    //         //         borderWidth: 1
    //         //     }]
    //         // },
    //         data:  {
    //             labels: ["January", "February", "March", "April", "May", "June", "July"],
    //             datasets: [
    //                 {
    //                     label: "My First dataset",
    //                     fillColor: "rgba(220,220,220,0.2)",
    //                     strokeColor: "rgba(220,220,220,1)",
    //                     pointColor: "rgba(220,220,220,1)",
    //                     pointStrokeColor: "#fff",
    //                     pointHighlightFill: "#fff",
    //                     pointHighlightStroke: "rgba(220,220,220,1)",
    //                     data: this.props.sums
    //                 },
    //             ]
    //         },
    //         options: {
    //             scales: {
    //                 yAxes: [{
    //                     ticks: {
    //                         beginAtZero: true
    //                     }
    //                 }]
    //             }
    //         },
    //         chartStyle: {
    //             width: '100',
    //             height: '100'
    //         }
    //     }
    // }


    // componentWillReceiveProps(nextProps) {
    //     // const someData = {...this.state.data.datasets[0].data}
    //     // booho = nextProps.sums
    //     //     this.setState({booho});
    //     //this.setState({updated: nextProps.updated});
    //     this.setState({ data: { datasets: [{ data: nextProps.sums }] } })
    //     // const ctx = document.getElementById('myChart');
    //     // new Chart(ctx, this.state)

    // }

    // componentDidMount() {
    // }

    render() {
        
        var data = {
            labels: this.props.survey.surveys.map(survey => {
               return survey.date 
            }),
            datasets: [
                {

                    //#7ebc59; - green  #368cbf; blue #33363b; gray on the drop down menu

                    label: "My First dataset",
                    fillColor: "#7ebc59",
                    strokeColor: "#368cbf",
                    pointColor: "#33363b",
                    pointStrokeColor: "#fff",
                    pointHighlightFill: "#fff",
                    pointHighlightStroke: "rgba(220,220,220,1)",
                    data: this.props.survey.sums
                },
            ]
        };

        return <Line data={data} redraw width="600" height="250"/>
    }
}