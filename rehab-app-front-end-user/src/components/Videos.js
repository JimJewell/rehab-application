import React, { Component } from 'react'

export default class Videos extends Component {
    render () {
        return (
            <div>
                <h2>{this.props.name}</h2>
                {(this.props.name === 'Neck Assessment' || this.props.name === 'All') && <div>      
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/faf_CS4Z0yc" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/w7Zn2tZ1goY" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/wDI4ta46ttM" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/5h_UlmquvUE" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                </div>}

                {(this.props.name === 'Low Back Pain Assessment' || this.props.name === 'All') && <div>      
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/20zybMbnVoU" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/i_ohtG0DKrw" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/iVyVnbESt1s" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                </div>}

                {(this.props.name === 'Lower Extremity Assessment' || this.props.name === 'All') && <div>      
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/7TAslg8p2Vo" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/QzVdEyyIiu4" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/M9thyTdrYxw" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/1zv-tPGjXqY" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/zaFv0qNjSs0" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/ZWu9MSC6WMw" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                </div>}

                {(this.props.name === 'Physical Function Assessment' || this.props.name === 'All') && <div>      
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/fcOde_cX-n8" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/l5oPv0orBRE" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/iDIcpEWye48" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    <iframe width="375" height="315" src="https://www.youtube.com/embed/bdJ7DT2L5_w" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                </div>}

                {(this.props.name === 'Upper Extremity Assessment' || this.props.name === 'All') && <div>      
                        <iframe width="375" height="315" src="https://www.youtube.com/embed/WxUJM2dPnrA?list=PLMnHlHoq4yFQAFSO9CNx_3b25993iytZL" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        <iframe width="375" height="315" src="https://www.youtube.com/embed/IyWJwO-hdTU?list=PLMnHlHoq4yFQAFSO9CNx_3b25993iytZL" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        <iframe width="375" height="315" src="https://www.youtube.com/embed/7Vm1ioTcvls?list=PLMnHlHoq4yFQAFSO9CNx_3b25993iytZL" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        <iframe width="375" height="315" src="https://www.youtube.com/embed/tUDm-EanQ9E?list=PLMnHlHoq4yFQAFSO9CNx_3b25993iytZL" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        <iframe width="375" height="315" src="https://www.youtube.com/embed/tlOYVdz2WNM?list=PLMnHlHoq4yFQAFSO9CNx_3b25993iytZL" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                        <iframe width="375" height="315" src="https://www.youtube.com/embed/XGAZmqoP8Fw?list=PLMnHlHoq4yFQAFSO9CNx_3b25993iytZL" frameborder="0" allow="accelerometer; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>}

                </div>
        )
    }
}
