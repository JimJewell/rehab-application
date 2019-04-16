import React from "react";

export default () => {
  return (
    <div>
      <h2 className="videoHeader">Initial Survey Videos</h2>
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/faf_CS4Z0yc"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/w7Zn2tZ1goY"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/wDI4ta46ttM"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/5h_UlmquvUE"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
    </div>
  );
};
