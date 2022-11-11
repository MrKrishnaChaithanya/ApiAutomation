@RegressionTest
Feature: Validate GET_ID

  Scenario: Validate GET_ID
    Given Open GET Request
    When check the response
    Then print response
