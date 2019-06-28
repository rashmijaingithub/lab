$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/WorkSpace/MercuryBDDPOM/src/test/resources/Features/test.feature");
formatter.feature({
  "name": "Mercury Application test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to Mercury Application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user loads application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_loads_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.enter_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clases the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_clases_the_Application()"
});
formatter.result({
  "status": "passed"
});
});