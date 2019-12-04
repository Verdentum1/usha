$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/bindu/gmail_test/src/test/resources/feature/feature1.feature");
formatter.feature({
  "name": "gmail title testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate title",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch site",
  "keyword": "Given "
});
formatter.match({
  "location": "Gluecode.method2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user id page is displayed",
  "keyword": "When "
});
formatter.match({
  "location": "Gluecode.method3()"
});
formatter.write("User id test passed");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Title \"Gmail\" will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Gluecode.method4(String)"
});
formatter.write("Title Test Passed");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "Gluecode.method5()"
});
formatter.result({
  "status": "passed"
});
});