$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeatureFiles/login.feature");
formatter.feature({
  "name": "Login functionality of boohoo.com website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check wheather the login functions  working properly",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on boohoo website",
  "keyword": "Given "
});
formatter.match({
  "location": "BoohooLoginDefinitions.user_is_on_boohoo_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to accept or dismiss the popup",
  "keyword": "And "
});
formatter.match({
  "location": "BoohooLoginDefinitions.user_has_to_accept_or_dismiss_the_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button account icon",
  "keyword": "When "
});
formatter.match({
  "location": "BoohooLoginDefinitions.user_clicks_on_the_login_button_account_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the valid email and password",
  "keyword": "And "
});
formatter.match({
  "location": "BoohooLoginDefinitions.user_has_to_enter_the_valid_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "BoohooLoginDefinitions.user_has_to_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User succesfully logged into the webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "BoohooLoginDefinitions.user_succesfully_logged_into_the_webpage()"
});
formatter.result({
  "status": "passed"
});
});