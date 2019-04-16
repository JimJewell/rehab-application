import React from "react";

export default () => {
  return (
    <div>
      <h2 className="videoHeader">Initial Survey Videos</h2>
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/fcOde_cX-n8"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/l5oPv0orBRE"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/iDIcpEWye48"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
      <iframe
        className="videos"
        src="https://www.youtube.com/embed/bdJ7DT2L5_w"
        frameBorder="0"
        allow="accelerometer; encrypted-media; gyroscope; picture-in-picture"
        allowFullScreen
      />
    </div>
  );
};
