#Author: your.email@your.domain.com


Feature: Mercury sign up panel 

Background: 
Given user is on the mercury sign up page

@smoke @regression
Scenario: Mercury sign up module testing with positive data 


When user enters postive first name "bob" for positive data
And user enters last name  mercury sign up page "vance" for positive data
And user enters phone number "32673476" for positive data
And user enters email "test@test.com" for positive data

@smoke @regression
Scenario: Mercury sign up module testing with negative data 


When user enters first name mercury sign up page "3243" for negative data
And user enters last name  mercury sign up page "$%8" for negative data
And user enters phone number "326832" for negative data
And user enters email "test" for negative data
