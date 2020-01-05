Feature: Mercury sign up panel

@regression @data
  Scenario Outline: Mercury sign up module with multiple sets of data
    Given user is on the mercury sign up page
    When user enters first name with "<firstname>"
    And user enters last name with "<lastname>"
    Then user should be able to create an account
    Then user can close the browser

    Examples: 
      | firstname | lastname |
      | Micheael  | Jordan   |
      | Bob       | Vance    |
      |    131313 | dfd      |
      | basant    | Poudel   |
      | test      | test     |
