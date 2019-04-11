import React from "react";
import image from './icons/rehabiticontransparent.png'


export default ({ updateCurrentLocation, setUserType, userType }) => {
  return (
    <div>
      <header className="header">
          <div className="logo">
          <img src={require("./icons/rehabiticontransparent.png")} />
          </div>
        <nav className="nav">
          <ul className="nav-list">
            {userType === "none" && (

              <div className="dropdown">
                <button className="dropbtn">Login</button>
                <div className="dropdown-content">
                  <li className="nav-list-item">
                    <a onClick={() => setUserType("patient")}>Patients</a>
                  </li>
                  <li className="nav-list-item">
                    <a onClick={() => setUserType("professional")}>
                      Medical Professionals
                    </a>
                  </li>
                </div>

              </div>
            )}
            {userType === "patient" && (
              <div className="dropdown">
               <button className="dropbtn">Menu</button>
               <div className="dropdown-content">
                <li className="nav-list-item">
                  <a onClick={() => updateCurrentLocation("survey")}>Survey</a>
                </li>
                <li className="nav-list-item">
                  <a onClick={() => updateCurrentLocation("video")}>Videos</a>
                </li>
                </div>
              </div>
            )}
            {userType === "professional" && (
              <div className="dropdown">
              <button className="dropbtn">Menu</button>
              <div className="dropdown-content">
                <li className="nav-list-item">
                  <a onClick={() => updateCurrentLocation("survey")}>Reports</a>
                </li>
                <li className="nav-list-item">
                  <a onClick={() => updateCurrentLocation("video")}>
                    Send Surveys
                  </a>
                </li>

              <li className="nav-list-item">
              <a onClick={() => updateCurrentLocation("addSurvey")}>Add Survey
              </a>
              </li>
              </div>
              </div>
            )}
          </ul>
        </nav>
      </header>
    </div>
  );
};
