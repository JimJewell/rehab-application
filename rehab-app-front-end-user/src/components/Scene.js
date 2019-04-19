import 'aframe'
import React, {Component} from 'react'

class Scene extends Component {
  render () {
    return (
      <a-scene>
        <a-entity windows-motion-controls="hand: left"></a-entity>
        <a-entity windows-motion-controls="hand: right"></a-entity>
        
        <a-gltf-model 
        src={require('./images/skeleton.gltf')}
        position="-2 0 -3"
        scale=".5 .5 .5"/>

        <a-gltf-model 
        src={require('./images/skeleton.gltf')}
        position="0 0 -3"
        scale=".5 .5 .5"/>

        <a-gltf-model 
        src={require('./images/skeleton.gltf')}
        position="2 0 -3"
        scale=".5 .5 .5"/>

        <a-plane 
          position="0 0 0" 
          rotation="-90 0 0" 
          width="10" 
          height="10" 
          color="grey"/>
      </a-scene>
    );
  }
}

export default Scene;