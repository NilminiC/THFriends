$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PetInsurance.feature");
formatter.feature({
  "name": "I want to create a Pet Insurance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Positive test on Pet Insurance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PetInsurance"
    }
  ]
});
formatter.step({
  "name": "User navigated to website url",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e and logs in",
  "keyword": "When "
});
formatter.step({
  "name": "Navigate to Pet Insurance page",
  "keyword": "Then "
});
formatter.step({
  "name": "Select the Falcon Insurer",
  "keyword": "Then "
});
formatter.step({
  "name": "Select the plan",
  "keyword": "And "
});
formatter.step({
  "name": "User fill in the prospect detail for the plan",
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
        "demouser",
        "demoUser1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Positive test on Pet Insurance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PetInsurance"
    }
  ]
});
formatter.step({
  "name": "User navigated to website url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.agentapp.steps.LoginSteps.user_navigated_to_website_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters demouser and demoUser1 and logs in",
  "keyword": "When "
});
formatter.match({
  "location": "com.agentapp.steps.LoginSteps.user_enters_and_and_logs_in(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Pet Insurance page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.agentapp.steps.PetInsuranceSteps.navigate_to_Pet_Insurance_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.agentapp.pageobjects.PetInsPageObjects.linkPetInsurance(PetInsPageObjects.java:25)\r\n\tat com.agentapp.steps.PetInsuranceSteps.navigate_to_Pet_Insurance_page(PetInsuranceSteps.java:28)\r\n\tat ✽.Navigate to Pet Insurance page(file:///C:/Users/Nilmini/Documents/eclipseWorkspace/TestingFutureReady/src/test/resources/features/PetInsurance.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Select the Falcon Insurer",
  "keyword": "Then "
});
formatter.match({
  "location": "com.agentapp.steps.PetInsuranceSteps.select_the_Falcon_Insurer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the plan",
  "keyword": "And "
});
formatter.match({
  "location": "com.agentapp.steps.PetInsuranceSteps.select_the_plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fill in the prospect detail for the plan",
  "keyword": "Then "
});
formatter.match({
  "location": "com.agentapp.steps.PetInsuranceSteps.user_fill_in_the_prospect_detail_for_the_plan()"
});
formatter.result({
  "status": "skipped"
});
});