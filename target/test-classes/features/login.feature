@login.feature
Feature: login to Tray.io website and create a workflow
  Scenario: login and create workflow

    Given I am at the trayio "https://app.tray.io/login" website
    And I log in
    Then I should see the Dashboard
    When I click on create a new workflow
    Then I should see the trigger selection screen
    When I click the close button
    Then I should see the workflow
    When I delete the workflow
    And I confirm that the workflow is deleted
    Then I should log out