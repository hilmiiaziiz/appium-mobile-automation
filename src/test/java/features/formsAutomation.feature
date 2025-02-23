Feature: Form Automation

  Background: Open Apps
    Given User open the Apps

  Scenario: Form Automation Scenario 1
    When User click Forms button
    And User on text-input input forms1@99.co
    When User click switch button
    And Verify Click to turn the switch OFF text appears
    And User wait 2 seconds
    When User click Dropdown button
    And User click element with webdriver.io is awesome text
    Then User click button-Active button

  Scenario: Form Automation Scenario 2
    When User click Forms button
    And User on text-input input Form2@99.co
    And Verify Click to turn the switch ON text appears
    When User click Dropdown button
    And User click element with This app is awesome text
    Then User click button-Active button

  Scenario: Form Automation Scenario 3
    When User click Forms button
    And User on text-input input f0rm3@99.co
    When User click switch button
    And Verify Click to turn the switch OFF text appears
    When User click Dropdown button
    And User click element with Appium is awesome text
    Then User click button-Inactive button

