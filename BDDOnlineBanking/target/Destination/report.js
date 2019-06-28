$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/WorkSpace/BDDOnlineBanking/src/test/resources/Features/OnlineBanking.feature");
formatter.feature({
  "name": "Online Banking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC_001_Login Page:Login Validations for valid and invalid users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Logoff from the System",
  "keyword": "Then "
});
formatter.step({
  "name": "User enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Validate the message \"\u003cMessage\u003e\"",
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
        "password",
        "Message"
      ]
    },
    {
      "cells": [
        "invalid",
        "invalid",
        "Invalid"
      ]
    },
    {
      "cells": [
        "jsmith",
        "Demo1234",
        "Valid"
      ]
    }
  ]
});
formatter.background({
  "name": "Application loads and login with Valid username and password",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user loadsApplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.user_loadsApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid \"jsmith\" and \"Demo1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_Login Page:Login Validations for valid and invalid users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Logoff from the System",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.logoff_from_the_System()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid \"invalid\" and \"invalid\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the message \"Invalid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.validate_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Application loads and login with Valid username and password",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user loadsApplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.user_loadsApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid \"jsmith\" and \"Demo1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001_Login Page:Login Validations for valid and invalid users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Logoff from the System",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.logoff_from_the_System()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid \"jsmith\" and \"Demo1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the message \"Valid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.validate_the_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TTC_003_Transfer Funds Page: Transfer fund",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Click on Transfer Funds link in left hand navigation section",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify that Transfer Funds page is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "Select From Account, To Account and \u003camount\u003e to Transfer and click on Transfer Money button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify that a message is displayed with correct amount and from/to account details",
  "keyword": "And "
});
formatter.step({
  "name": "Logoff from the System",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "amount"
      ]
    },
    {
      "cells": [
        "100"
      ]
    }
  ]
});
formatter.background({
  "name": "Application loads and login with Valid username and password",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user loadsApplication",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.user_loadsApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid \"jsmith\" and \"Demo1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.user_enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TTC_003_Transfer Funds Page: Transfer fund",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Click on Transfer Funds link in left hand navigation section",
  "keyword": "Then "
});
formatter.match({
  "location": "FundTransferPageSteps.click_on_Transfer_Funds_link_in_left_hand_navigation_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that Transfer Funds page is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "FundTransferPageSteps.verify_that_Transfer_Funds_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select From Account, To Account and 100 to Transfer and click on Transfer Money button",
  "keyword": "Then "
});
formatter.match({
  "location": "FundTransferPageSteps.select_From_Account_To_Account_and_to_Transfer_and_click_on_Transfer_Money_button(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that a message is displayed with correct amount and from/to account details",
  "keyword": "And "
});
formatter.match({
  "location": "FundTransferPageSteps.verify_that_a_message_is_displayed_with_correct_amount_and_from_to_account_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logoff from the System",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.logoff_from_the_System()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});