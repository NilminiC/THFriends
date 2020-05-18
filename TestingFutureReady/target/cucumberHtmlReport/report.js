$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "I want to login to Futureready website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Positive test on login",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "Check user login to the main page",
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
  "name": "Positive test on login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
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
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d80.0.3987.149)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-M456OQN\u0027, ip: \u0027192.168.8.198\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\Nilmini\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:54310}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 61e079c1c56dd862e7113c6c83f190a4\n*** Element info: {Using\u003dxpath, value\u003d//input[@type\u003d\u0027text\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.agentapp.pageobjects.LoginPageObjects.txtUserName(LoginPageObjects.java:25)\r\n\tat com.agentapp.steps.LoginSteps.user_enters_and_and_logs_in(LoginSteps.java:39)\r\n\tat ✽.User enters demouser and demoUser1 and logs in(file:///C:/Users/Nilmini/git/THFriends/TestingFutureReady/src/test/resources/features/Login.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Check user login to the main page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.agentapp.steps.LoginSteps.check_user_login_to_the_main_page()"
});
formatter.result({
  "status": "skipped"
});
});