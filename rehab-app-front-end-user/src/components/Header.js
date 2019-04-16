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
                  <li onClick={() => (setUserType("patient"),
                      updateCurrentLocation("survey"))} className="nav-list-item">
                    <a >
                      <i className="fas fa-user-injured"> </i> Patients
                    </a>
                  </li>
                  <li onClick={() => setUserType("professional")} className="nav-list-item">
                    <a >
                      <i className="fas fa-user-md"> </i> Medical Professionals
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
                  <li onClick={() => updateCurrentLocation("survey")} className="nav-list-item">
                    <a >
                      <i className="far fa-question-circle"> </i> Survey
                    </a>
                  </li>
                  <li onClick={() => updateCurrentLocation("video")} className="nav-list-item">
                    <a >
                      <i className="fas fa-film"> </i> Videos
                    </a>
                  </li>
                  <li onClick={() => (setUserType("none"), updateCurrentLocation("survey"))} className="nav-list-item">
                  <a >
                      <i className="fas fa-sign-out-alt"> </i> Logout
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
                  <li onClick={() => updateCurrentLocation("surveyReport")} className="nav-list-item__pro">
                    <a >
                      <i className="far fa-chart-bar"> </i> Reports
                    </a>
                  </li>
                  <li onClick={() => updateCurrentLocation("surveyList")} className="nav-list-item__pro">
                    <a >
                      <i className="fas fa-share-square" /> Assign Survey
                    </a>
                  </li>

                  <li onClick={() => updateCurrentLocation("addSurvey")} className="nav-list-item__pro">
                    <a >
                      <i className="far fa-plus-square"> </i> Add Survey
                    </a>
                  </li>
                  <li  onClick={() => (setUserType("none"), updateCurrentLocation("survey"))} className="nav-list-item__pro">
                    <a >
                      <i className="fas fa-sign-out-alt"> </i> Logout
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
