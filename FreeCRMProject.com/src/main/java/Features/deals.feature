Feature: Deal data creation

#Data table
Scenario: Free CRM create a new deal

Given usser is already on login page
When title of login page is Free CRM
Then user enters username and password

| reshma4a1@gmail.com | crm123 |

Then usser clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details

| test deal1 | 50 | 10 |

Then Close the browser

