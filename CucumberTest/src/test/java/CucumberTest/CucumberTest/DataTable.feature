Feature: DataTableStepDef 
#This is how background can be used to eliminate duplicate steps 

Background: 
   Given I am on Sign-Up page 

#Scenario with DataTable 
Scenario: 
   When I enter valid data on the page
| Fields                 | Values              |N|
| First Name             | Tom                 |1|
| Last Name              | Kenny               |2|
| Email Address          | someone@someone.com |3|
| Re-enter Email Address | someone@someone.com |4|
| Password               | Password1           |5|
| Birthdate              | 01                  |6|
  Then the user registration should be successful.