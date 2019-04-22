import React from "react";

export default ({ updateCurrentLocation, setUserType, userType }) => {
  return (
    <div>
      {userType === "none" && (
        <header className="header">
          <div className="logo">
            <img
              src={require("./icons/rehabiticontransparent.png")}
              alt="Rehab"
            />
          </div>
          <nav className="nav">
            <ul className="nav-list">
              <div className="dropdown">
                <button className="dropbtn">Login</button>
                <div className="dropdown-content">
                  <li
                    onClick={() => setUserType("patlogin")}
                    className="nav-list-item"
                  >
                    <p>
                      <i className="fas fa-user-injured"> </i> Patients
                    </p>
                  </li>
                  <li
                    onClick={() => setUserType("prologin")}
                    className="nav-list-item"
                  >
                    <p>
                      <i className="fas fa-user-md"> </i> Medical Professionals
                    </p>
                  </li>
                </div>
              </div>
            </ul>
          </nav>
        </header>
      )}
      {userType === "patient" && (
        <header className="header__patient">
            <div className="logo">
              <img className="vrIcon" onClick={() => updateCurrentLocation("scene")} src={require("./icons/vrIcon2.png")} />
              <img onClick={() => setUserType("none")} src={require("./icons/rehabiticontransparent.png")} alt="Rehab"/>

            </div>

          <nav className="nav">
            <ul className="nav-list">
              <div className="dropdown">
                <button className="dropbtn">Menu</button>
                <div className="dropdown-content">
                  <li
                    onClick={() => updateCurrentLocation("survey")}
                    className="nav-list-item"
                  >
                    <p>
                      <i className="far fa-question-circle"> </i> Survey
                    </p>
                  </li>
                  <li
                    onClick={() => updateCurrentLocation("video")}
                    className="nav-list-item"
                  >
                    <p>
                      <i className="fas fa-film"> </i> Videos
                    </p>
                  </li>
                  <li
                    onClick={() => (
                      setUserType("none"), updateCurrentLocation("survey")
                    )}
                    className="nav-list-item"
                  >
                    <p>
                      <i className="fas fa-sign-out-alt"> </i> Logout
                    </p>
                  </li>
                </div>
              </div>
            </ul>
          </nav>
        </header>
      )}
      {userType === "professional" && (
        <header className="header__professional">
          <p onClick={() => setUserType("none")}>
            <div className="logo">
              <img
                src={require("./icons/rehabiticontransparent.png")}
                alt="Rehab"
              />
            </div>
          </p>
          <nav className="nav">
            <ul className="nav-list">
              <div className="dropdown">
                <button className="dropbtn__pro">Menu</button>
                <div className="dropdown-content">
                  <li
                    onClick={() => updateCurrentLocation("surveyReport")}
                    className="nav-list-item__pro"
                  >
                    <p>
                      <i className="far fa-chart-bar"> </i> Reports
                    </p>
                  </li>
                  <li
                    onClick={() => updateCurrentLocation("survey")}
                    className="nav-list-item__pro"
                  >
                    <p>
                      <i className="fas fa-share-square" /> Assign Survey
                    </p>
                  </li>

                  <li
                    onClick={() => updateCurrentLocation("addSurvey")}
                    className="nav-list-item__pro"
                  >
                    <p>
                      <i className="far fa-plus-square"> </i> Add Survey
                    </p>
                  </li>
                  <li
                    onClick={() => (
                      setUserType("none"), updateCurrentLocation("survey")
                    )}
                    className="nav-list-item__pro"
                  >
                    <p>
                      <i className="fas fa-sign-out-alt"> </i> Logout
                    </p>
                  </li>
                </div>
              </div>
            </ul>
          </nav>
        </header>
      )}
      {userType === "prologin" && (
        <header className="header">
          <div className="logo">
            <img
              src={require("./icons/rehabiticontransparent.png")}
              alt="Rehab"
            />
          </div>
        </header>
      )}
      {userType === "patlogin" && (
        <header className="header">
          <div className="logo">
            <img
              src={require("./icons/rehabiticontransparent.png")}
              alt="Rehab"
            />
          </div>
        </header>
      )}
    </div>
  );
};