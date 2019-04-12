import React from "react";
import image from "./icons/rehabiticontransparent.png";

export default ({ updateCurrentLocation, setUserType, userType }) => {
  return (
    <div>
      {userType === "none" && (
        <header className="header">
          <div className="logo">
            <img src={require("./icons/rehabiticontransparent.png")} />
          </div>
          <nav className="nav">
            <ul className="nav-list">
              <div className="dropdown">
                <button className="dropbtn">Login</button>
                <div className="dropdown-content">
                  <li className="nav-list-item">
                    <a onClick={() => setUserType("patient")}>
                      <i class="fas fa-user-injured"> </i> Patients
                    </a>
                  </li>
                  <li className="nav-list-item">
                    <a onClick={() => setUserType("professional")}>
                      <i class="fas fa-user-md"> </i> Medical Professionals
                    </a>
                  </li>
                </div>
              </div>
            </ul>
          </nav>
        </header>
      )}
      {userType === "patient" && (
        <header className="header__patient">
          <a onClick={() => setUserType("none")}>
            <div className="logo">
              <img src={require("./icons/rehabiticontransparent.png")} />
            </div>
          </a>
          <nav className="nav">
            <ul className="nav-list">
              <div className="dropdown">
                <button className="dropbtn">Menu</button>
                <div className="dropdown-content">
                  <li className="nav-list-item">
                    <a onClick={() => updateCurrentLocation("survey")}>
                      <i class="far fa-question-circle"> </i> Survey
                    </a>
                  </li>
                  <li className="nav-list-item">
                    <a onClick={() => updateCurrentLocation("video")}>
                      <i class="fas fa-film"> </i> Videos
                    </a>
                  </li>
                  <li className="nav-list-item">
                    <a onClick={() => setUserType("none")}>
                      <i class="fas fa-sign-out-alt"> </i> Logout
                    </a>
                  </li>
                </div>
              </div>
            </ul>
          </nav>
        </header>
      )}
      {userType === "professional" && (
        <header className="header__professional">
          <a onClick={() => setUserType("none")}>
            <div className="logo">
              <img src={require("./icons/rehabiticontransparent.png")} />
            </div>
          </a>
          <nav className="nav">
            <ul className="nav-list">
              <div className="dropdown">
                <button className="dropbtn__pro">Menu</button>
                <div className="dropdown-content">
                  <li className="nav-list-item__pro">
                    <a onClick={() => updateCurrentLocation("survey")}>
                      <i class="far fa-chart-bar"> </i> Reports
                    </a>
                  </li>
                  <li className="nav-list-item__pro">
                    <a onClick={() => updateCurrentLocation("video")}>
                      <i class="fas fa-share-square" /> Send Surveys
                    </a>
                  </li>

                  <li className="nav-list-item__pro">
                    <a onClick={() => updateCurrentLocation("addSurvey")}>
                      <i class="far fa-plus-square"> </i> Add Survey
                    </a>
                  </li>
                  <li className="nav-list-item__pro">
                    <a onClick={() => setUserType("none")}>
                      <i class="fas fa-sign-out-alt"> </i> Logout
                    </a>
                  </li>
                </div>
              </div>
            </ul>
          </nav>
        </header>
      )}
    </div>
  );
};
