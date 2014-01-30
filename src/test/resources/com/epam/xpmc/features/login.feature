@done @login
Feature: Login functionality

  Scenario: As User I want be able to login to the jira system
    Given User wants to login
    When User login to the system with username "admin" and password "admin"
    Then User should see Test Management plugin page
