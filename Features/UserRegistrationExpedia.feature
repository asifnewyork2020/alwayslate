
@UserRegistration
Feature: Expedia App- User Registration

 
  Scenario Outline: Valid User Registration
    Given I am on a homepage
    When I click on register link
    And  I enter "<Email address>" and "<password>" 
    And  I click submit button
    Then I get sucessful user registration notification

    Examples: 
    |Email address            |password  |confirm password|
    |asifhossain472@gmail.com |Apple2022$|Apple2022$      |
      
