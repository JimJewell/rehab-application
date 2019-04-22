import 'aframe'
import React, {Component} from 'react'

  // AFRAME.registerComponent("foo", {
  // init: function() {
  // this.el.addEventListener("click", (e)=>{
  //  console.log('click')
  // })
  // }
  // })
  

class Scene extends Component {
  render () {
    return (
      <div id="a-scene" className="a-scene">
        <a-scene cursor="rayOrigin: mouse">


        {/* <a-camera position="0 1 0">
          <a-cursor scale="0.5 0.5" color="black"></a-cursor>
        </a-camera> */}

        <a-entity raycaster="objects: [data-raycastable]" cursor></a-entity>


        {/* <a-entity windows-motion-controls="hand: left"></a-entity>
        <a-entity windows-motion-controls="hand: right"></a-entity> */}

        <a-entity>
        <a-gltf-model 
        data-raycastable
        src={require('./images/skeleton.gltf')}
        position="-2 0 -3"
        scale=".25 .25 .25"
        onclick="{
          let textBox1 = document.querySelector('#skeleton__text1')
          if(textBox1.getAttribute('position').y == -10){
            textBox1.setAttribute('position', {x:2,  y:3,  z:-4})

          } else {
            textBox1.setAttribute('position', {x:2,  y:-10,  z:-4})

          }
      }">
        </a-gltf-model>
        </a-entity>

        <a-entity data-raycastable>
        <a-gltf-model
        data-raycastable
        src={require('./images/skeleton.gltf')}
        position="0 0 -3"
        scale=".25 .25 .25"
        onclick="{
          let textBox1 = document.querySelector('#skeleton__text2')
          if(textBox1.getAttribute('position').y == -10){
            textBox1.setAttribute('position', {x:4,  y:4,  z:-4})

          } else {
            textBox1.setAttribute('position', {x:4,  y:-10,  z:-4})

          }
      }">

        </a-gltf-model>
        </a-entity>

        <a-entity>
        <a-gltf-model 
        src={require('./images/skeleton.gltf')}
        position="2 0 -3"
        scale=".25 .25 .25"
        onclick="{
          let textBox1 = document.querySelector('#skeleton__text3')
          if(textBox1.getAttribute('position').y == -10){
            textBox1.setAttribute('position', {x:6,  y:3,  z:-4})

          } else {
            textBox1.setAttribute('position', {x:6,  y:-10,  z:-4})

          }
      }">
        </a-gltf-model>
        </a-entity>

        <a-plane 
          position="0 0 0" 
          rotation="-90 0 0" 
          width="10" 
          height="10" 
          color="grey">
          </a-plane>

        <a-entity id="skeleton__text1"
        text="value: Hello World"
        position="2 -10 -4"
        scale="10 10 1"
        ></a-entity>

        <a-entity id="skeleton__text2"
        text="value: Hello World"
        position="4 -10 -4"
        scale="10 10 1"
        ></a-entity>

        <a-entity id="skeleton__text3"
        text="value: Hello World"
        position="6 -10 -4"
        scale="10 10 1"
        ></a-entity>
        
      </a-scene>
      </div>  
    );
  }
}


export default Scene;