$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality test",
  "description": "As a user i should be able to Login successfully",
  "id": "login-functionality-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "I want to verify error message after login with invalid credential",
  "description": "",
  "id": "login-functionality-test;i-want-to-verify-error-message-after-login-with-invalid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I click login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I navigate to Login page and verify HeartBingo logo",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I add \"\u003cUSERNAME\u003e\" in username field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I add \"\u003cPASSWORD\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see \"\u003cERROR\u003e\" message and verify it",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I close Login frame",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should back on Homepage and verify that i am on Homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login-functionality-test;i-want-to-verify-error-message-after-login-with-invalid-credential;",
  "rows": [
    {
      "cells": [
        "USERNAME",
        "PASSWORD",
        "ERROR"
      ],
      "line": 21,
      "id": "login-functionality-test;i-want-to-verify-error-message-after-login-with-invalid-credential;;1"
    },
    {
      "cells": [
        "bob",
        "bob123",
        "The username or password you entered is incorrect. Please try again."
      ],
      "line": 22,
      "id": "login-functionality-test;i-want-to-verify-error-message-after-login-with-invalid-credential;;2"
    },
    {
      "cells": [
        "bob@gmail.com",
        "bob123",
        "The username or password you entered is incorrect. Please try again."
      ],
      "line": 23,
      "id": "login-functionality-test;i-want-to-verify-error-message-after-login-with-invalid-credential;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7987296900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify Login link displayed on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 133370800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iVerifyLoginLinkDisplayedOnHomepage()"
});
