Feature: Login Automation

  Background: Open Apps
    Given User open the Apps

  Scenario: Valid login proses
    When User click Login button
    And User on input-email input mail@test.com
    And User on input-password input 12345678
    When User click button-LOGIN button
    And User wait 3 seconds
    Then Verify You are logged in! text appears

  Scenario: Invalid username login proses
    When User click Login button
    And User on input-email input wrong
    And User on input-password input 12345678
    When User click button-LOGIN button
    Then Verify Please enter a valid email address text appears

  Scenario: Invalid password login proses
    When User click Login button
    And User on input-email input mail@test.com
    And User on input-password input wrong
    When User click button-LOGIN button
    Then Verify Please enter at least 8 characters text appears

  Scenario: Invalid username and password login proses
    When User click Login button
    And User on input-email input wrong
    And User on input-password input wrong
    When User click button-LOGIN button
    Then Verify Please enter a valid email address text appears
    Then Verify Please enter at least 8 characters text appears