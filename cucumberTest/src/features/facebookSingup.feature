#Author: your.email@your.domain.com
#Keywords Summary :


Feature: Sign up module testing for facebook

 Background: 
 
 Given user is on the facebook home page
 
  Scenario: testing facebook signup with valid credentials
  
    When user enters last name for signup
    When user enters first Name
    And user enters email address
    And user enters new password for signup
    And user select birhtday month 
    And user select birth date
    And user select birth year
   And use clicks on the sign up button
    Then user should have a new account
    And user should be in the new account home page
    And close the browser
    
   Scenario: testing facebook signup with invalid credentials
   
   
   When user enters invalid first name
   When user enters invalid last name
   Then user should not be able to create a login
   And close the browser
    
    
    

  
 