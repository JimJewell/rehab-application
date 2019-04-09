import React from "react";

export default () => {
  return (
    <div>
      <h2 className="videoHeader">Initial Survey Videos</h2>
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/20zybMbnVoU"
        frameborder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/i_ohtG0DKrw"
        frameborder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/iVyVnbESt1s"
        frameborder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      />
    </div>
  );
};
