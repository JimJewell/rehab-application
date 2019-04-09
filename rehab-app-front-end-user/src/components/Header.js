import React from "react";

export default ({ updateCurrentLocation }) => {
  return (
    <div>
      <header className="header">
        <h1 className="logo">iMyRehabr</h1>
        <nav className="nav">
          <ul className="nav-list">
            <li className="nav-list-item">
              <a onClick={() => updateCurrentLocation("survey")}>Survey</a>
            </li>
            <li className="nav-list-item">
              <a onClick={() => updateCurrentLocation("video")}>Videos</a>
            </li>
          </ul>
        </nav>
      </header>
    </div>
  );
};
