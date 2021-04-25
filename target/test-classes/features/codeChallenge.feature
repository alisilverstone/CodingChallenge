#Author: alisilverstone7@gmail.com

@Smoke
Feature: Automation Challenge
  This is a sample automation feature to show my skills.

  @Smoke
  Scenario: Add user to dash board page
   Given navigate to dashboard page
   When click on add user
   Then Enter name as "testFirstName", Last name as "testLastName"
   And  Enter userName as "tester123", password as "password123"
   Then Choose Customer as "Company AAA"
   And Choose role as "Admin"
   Then Enter email as "testers@testmail.com"
   And Enter cellphone as "5553452434234"
   Then click on save button on add user menu.
   And verify the user with mobile number "5553452434234" is saved.
   
   @Smoke
   Scenario: Delete a user from dash board
   Given navigate to dashboard page
   When locate user "Novak" and delete it
   Then verify user "Novak" is deleted.

