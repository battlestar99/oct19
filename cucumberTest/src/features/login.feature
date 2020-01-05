# Author : razin anik
# date : 1/04/2020

Feature: login

  Scenario: testing the login page url from home page
    Given user is on the home page
    When user clicks on the login link
    Then user should navigate to the login page

  Scenario: testing the login panel with valid credentials
    Given user is on the login page
    When user enters righ username
    And user enters right password
    Then user should be able to login
    And user should be in the login home page
