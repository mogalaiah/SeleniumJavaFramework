$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression,Smoke"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "Login Functionality Through Background Keyword",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user Navigate to URL \"http://demo.guru99.com/Agile_Project/Agi_V1/index.php\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "Login With Valid UserName and Password",
  "description": "",
  "id": "login-functionality;login-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user enter userName as \"1303\" and passWord as \"Guru99\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user verify home page as \"Guru99 Bank\" is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click on logOut from Application",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user close the browser",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Login With Valid UserName and Password with Data Driven",
  "description": "",
  "id": "login-functionality;login-with-valid-username-and-password-with-data-driven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user enter userName as \"\u003cUserName\u003e\" and passWord as \"\u003cPassWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user verify home page as \"Guru99 Bank\" is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on logOut from Application",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user close the browser",
  "keyword": "When "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "login-functionality;login-with-valid-username-and-password-with-data-driven;",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord",
        "status"
      ],
      "line": 22,
      "id": "login-functionality;login-with-valid-username-and-password-with-data-driven;;1"
    },
    {
      "cells": [
        "1303",
        "Guru99",
        "success"
      ],
      "line": 23,
      "id": "login-functionality;login-with-valid-username-and-password-with-data-driven;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "Login Functionality Through Background Keyword",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user Navigate to URL \"http://demo.guru99.com/Agile_Project/Agi_V1/index.php\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "Login With Valid UserName and Password with Data Driven",
  "description": "",
  "id": "login-functionality;login-with-valid-username-and-password-with-data-driven;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Regression,Smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user enter userName as \"1303\" and passWord as \"Guru99\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user verify home page as \"Guru99 Bank\" is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user click on logOut from Application",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user close the browser",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});