import React from "react";

export default () => {
  return (
    <div>
      <h2 className="videoHeader">Initial Survey Videos</h2>
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/faf_CS4Z0yc"
        frameborder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/w7Zn2tZ1goY"
        frameborder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/wDI4ta46ttM"
        frameborder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/5h_UlmquvUE"
        frameborder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      />
    </div>
  );
};
