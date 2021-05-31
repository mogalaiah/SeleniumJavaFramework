$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Feature/Login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression,Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Login With Valid UserName and Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression,Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user lunch chrome browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user lunch chrome browser(./Feature/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Navigate to URL \"http://demo.guru99.com/Agile_Project/Agi_V1/index.php\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user Navigate to URL \"http://demo.guru99.com/Agile_Project/Agi_V1/index.php\"(./Feature/Login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter userName as \"1303\" and passWord as \"Guru99\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user enter userName as \"1303\" and passWord as \"Guru99\"(./Feature/Login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user click on submit button(./Feature/Login.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user verify home page as \"Guru99 Bank\" is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user verify home page as \"Guru99 Bank\" is displayed(./Feature/Login.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on logOut from Application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user click on logOut from Application(./Feature/Login.feature:12)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "name": "Login With Valid UserName and Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user lunch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user Navigate to URL \"http://demo.guru99.com/Agile_Project/Agi_V1/index.php\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enter userName as \u003cUserName\u003e and passWord as \u003cPassWord\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "name": "user verify home page as \"Guru99 Bank\" is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord",
        "status"
      ]
    },
    {
      "cells": [
        "1303",
        "Guru99",
        "success"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login With Valid UserName and Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression,Smoke"
    }
  ]
});
formatter.step({
  "name": "user lunch chrome browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user lunch chrome browser(./Feature/Login.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user Navigate to URL \"http://demo.guru99.com/Agile_Project/Agi_V1/index.php\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user Navigate to URL \"http://demo.guru99.com/Agile_Project/Agi_V1/index.php\"(./Feature/Login.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter userName as 1303 and passWord as Guru99",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user enter userName as 1303 and passWord as Guru99(./Feature/Login.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user click on submit button(./Feature/Login.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user verify home page as \"Guru99 Bank\" is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "error_message": "java.lang.AbstractMethodError: Receiver class cucumber.runtime.java.JavaStepDefinition does not define or inherit an implementation of the resolved method \u0027abstract java.util.List matchedArguments(gherkin.pickles.PickleStep)\u0027 of interface cucumber.runtime.StepDefinition.\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatches(RuntimeGlue.java:77)\r\n\tat cucumber.runtime.RuntimeGlue.stepDefinitionMatch(RuntimeGlue.java:63)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:111)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:99)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:79)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:99)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:41)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:108)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:768)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n\tat ✽.user verify home page as \"Guru99 Bank\" is displayed(./Feature/Login.feature:19)\r\n",
  "status": "failed"
});
});