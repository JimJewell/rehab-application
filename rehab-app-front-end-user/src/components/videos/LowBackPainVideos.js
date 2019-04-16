import React from "react";

export default () => {
  return (
    <div>
      <h2 className="videoHeader">Initial Survey Videos</h2>
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/20zybMbnVoU"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/i_ohtG0DKrw"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/iVyVnbESt1s"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
    </div>
  );
};
