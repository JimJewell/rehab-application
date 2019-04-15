require("react/addons").addons.TestUtils;
import App from "../App";

var component = TestUtils.renderIntoDocument(<App />);

var header = TestUtils.findRenderedDOMComponentWithTag(component, "Header");

var survey = TestUtils.findRenderedDOMComponentWithTag(component, "Survey");

var surveyList = TestUtils.findRenderedDOMComponentWithTag(component, "SurveyList");
