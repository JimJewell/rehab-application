import 'aframe'
import React, {Component} from 'react'

class Scene extends Component {

  AFRAME.registerComponent('cursor-click1', {
    init: function(){
      let skeleton1 = document.querySelector("skeleton1")
      skeleton1.addEventListener('click', ()=> {
        document.querySelector("skeleton__text1").toggleAttribute("visible__text")
      }) 
    }
  })

  AFRAME.skeleton1.addEventListener('click',
  function(){
    console.log('click')
  }

  render () {
    return (
      <div className="a-scene">
        <a-scene>

        <a-entity windows-motion-controls="hand: left"></a-entity>
        <a-entity windows-motion-controls="hand: right"></a-entity>

        {/* <a-entity>
        <a-gltf-model 
        src={require('./images/skeleton.gltf')}
        position="-2 0 -3"
        scale=".25 .25 .25">
        </a-gltf-model>
        </a-entity> */}

        <a-entity className="skeleton1">
        <a-gltf-model 
        src={require('./images/skeleton.gltf')}
        position="0 0 -3"
        scale=".25 .25 .25">
        </a-gltf-model>
        </a-entity>

        {/* <a-entity>
        <a-gltf-model 
        src={require('./images/skeleton.gltf')}
        position="2 0 -3"
        scale=".25 .25 .25">
        </a-gltf-model>
        </a-entity> */}

        <a-plane 
          position="0 0 0" 
          rotation="-90 0 0" 
          width="10" 
          height="10" 
          color="grey">
          </a-plane>

        <a-entity className="skeleton__text1"
        text="value: Hello World"
        position="1 1 -4"
        scale="10 10 1"
        ></a-entity>
      </a-scene>
      </div>  
    );
  }
}


export default Scene;