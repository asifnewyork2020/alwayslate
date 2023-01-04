
@UserLogin
Feature: User Login
  
  Scenario Outline: Valid user login
    Given I am on flight homepage
    When I enter Email address,password in step
    And  I click sign on button
    Then I am on the flight reservation page


