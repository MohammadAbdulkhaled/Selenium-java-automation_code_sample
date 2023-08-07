Feature: feature to test login test functionality
  @login @validcredentials @smoke
  Scenario Outline: Check login is successfull with the valid credentials
    Given user is on login page
    When user enters <userid>username and <password>password
    And clicks on login button
    Then user is navigated to home page
    Examples: 
    |userid|password|
    |admin|123456|
    |admin1|654321|
    @smoke
    Scenario: Check login is unsuccessfull with the invalid credentials
    Given user is on login page
    When user enters the below details in the fields
    |firstname|Mohammad|
    |lastname|Abdulkhaled|
    |emailid|abdulo6|
    And clicks on login button
    Then user is navigated to home page

 
