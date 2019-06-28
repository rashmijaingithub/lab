$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/WorkSpace/Mercury/src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login to Mercury Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user loads application",
  "keyword": "Given "
});
formatter.step({
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ]
    },
    {
      "cells": [
        "mercury2",
        "mercury2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to Mercury Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user loads application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinationLoginExamples.user_loads_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"mercury\" and \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinationLoginExamples.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationLoginExamples.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login to Mercury Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user loads application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinationLoginExamples.user_loads_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"mercury2\" and \"mercury2\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinationLoginExamples.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationLoginExamples.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Invalid password to Mercury Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "user loads application",
  "keyword": "Given "
});
formatter.step({
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mercury",
        "sdfdfd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Invalid password to Mercury Application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user loads application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinationLoginExamples.user_loads_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"mercury\" and \"sdfdfd\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinationLoginExamples.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationLoginExamples.user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Click on the line",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user loads application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinationLoginExamples.user_loads_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Link",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});