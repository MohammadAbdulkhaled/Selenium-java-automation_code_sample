Feature: feature to test search functionality
 
  @search @smoke
  Scenario: Check search functionality in amazon with valid products
      Given user is on login23 page
     When user enters username23 and password21
    And clicks on login button1
    Then user is navigated to home page1
    
    