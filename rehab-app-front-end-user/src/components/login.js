import React, { Component } from "react";

export default class Login extends Component {
  loginUser = () => {
    this.props.setUserType("professional");
  };

  returnHome = () => {
    this.props.setUserType("none");
  };
  render() {
    return (
      <div className="loginsplashBacker">
        <div className="login">
          <div className="close" onClick={() => this.returnHome()}>
            <i class="far fa-window-close" />
          </div>
          <h2 className="loginHeader">Medical Professional Login</h2>
          <div className="loginStuff">
            <div className="userName">
              <i class="far fa-envelope">
                <input className="user" type="text" placeholder=" E-mail" />
              </i>
            </div>
            <div className="passWord">
              <i class="fas fa-key">
                <input
                  className="pass"
                  type="password"
                  placeholder=" Password"
                />
              </i>
            </div>
            <button className="genericButton" onClick={() => this.loginUser()}>
              Login
            </button>
          </div>
          <p className="forgotPass">Forgot Password?</p>
          <p className="register">Register</p>
        </div>
      </div>
    );
  }
}
