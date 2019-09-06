$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/JarvisWS/FreeCRMProject.com/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM create a new deal",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "usser is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "reshma4a1@gmail.com",
        "crm123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "usser clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_already_login_page()"
});
formatter.result({
  "duration": 10819917157,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 146950895,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 5799412705,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 130266157,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 14397667,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 2698179000,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 560872360,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 224406049,
  "status": "passed"
});
});