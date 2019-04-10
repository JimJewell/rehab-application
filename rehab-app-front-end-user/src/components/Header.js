import React from "react";

export default ({ updateCurrentLocation, setUserType, userType }) => {
  return (
    <div>
      <header className="header">
        <h1 className="logo">RehabIT</h1>
        <nav className="nav">
          <ul className="nav-list">
            {userType === "none" && (
              <div>
                <li className="nav-list-item">
                  <a onClick={() => setUserType("patient")}>Patients</a>
                </li>
                <li className="nav-list-item">
                  <a onClick={() => setUserType("professional")}>
                    Medical Professionals
                  </a>
                </li>
              </div>
            )}
            {userType === "patient" && (
              <div>
                <li className="nav-list-item">
                  <a onClick={() => updateCurrentLocation("survey")}>Survey</a>
                </li>
                <li className="nav-list-item">
                  <a onClick={() => updateCurrentLocation("video")}>Videos</a>
                </li>
              </div>
            )}
            {userType === "professional" && (
              <div>
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
            )}
          </ul>
        </nav>
      </header>
    </div>
  );
};
