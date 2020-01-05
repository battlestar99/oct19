$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebookSingup.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 5,
  "name": "Sign up module testing for facebook",
  "description": "",
  "id": "sign-up-module-testing-for-facebook",
  "keyword": "Feature"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user is on the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdeffacebook.user_is_on_the_facebook_home_page()"
});
formatter.result({
  "duration": 9683389100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "testing facebook signup with valid credentials",
  "description": "",
  "id": "sign-up-module-testing-for-facebook;testing-facebook-signup-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user enters last name for signup",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters first Name",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters email address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters new password for signup",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user select birhtday month",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user select birth date",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select birth year",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "use clicks on the sign up button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user should have a new account",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user should be in the new account home page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdeffacebook.user_enters_last_name_for_signup()"
});
formatter.result({
  "duration": 133873900,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_enters_first_Name()"
});
formatter.result({
  "duration": 97373200,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_enters_email_address()"
});
formatter.result({
  "duration": 127747800,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_enters_new_password_for_signup()"
});
formatter.result({
  "duration": 14600,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_select_birhtday_month()"
});
formatter.result({
  "duration": 14300,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_select_birth_date()"
});
formatter.result({
  "duration": 12200,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_select_birth_year()"
});
formatter.result({
  "duration": 30900,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.use_clicks_on_the_sign_up_button()"
});
formatter.result({
  "duration": 21700,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_should_have_a_new_account()"
});
formatter.result({
  "duration": 8800,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_should_be_in_the_new_account_home_page()"
});
formatter.result({
  "duration": 13100,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.close_the_browser()"
});
formatter.result({
  "duration": 852515900,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "user is on the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdeffacebook.user_is_on_the_facebook_home_page()"
});
formatter.result({
  "duration": 8950128600,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "testing facebook signup with invalid credentials",
  "description": "",
  "id": "sign-up-module-testing-for-facebook;testing-facebook-signup-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user enters invalid first name",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user enters invalid last name",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user should not be able to create a login",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdeffacebook.user_enters_invalid_first_name()"
});
formatter.result({
  "duration": 97629600,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_enters_invalid_last_name()"
});
formatter.result({
  "duration": 67694400,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.user_should_not_be_able_to_create_a_login()"
});
formatter.result({
  "duration": 14700,
  "status": "passed"
});
formatter.match({
  "location": "stepdeffacebook.close_the_browser()"
});
formatter.result({
  "duration": 1338765500,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author : razin anik"
    },
    {
      "line": 2,
      "value": "# date : 1/04/2020"
    }
  ],
  "line": 4,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "testing the login page url from home page",
  "description": "",
  "id": "login;testing-the-login-page-url-from-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the login link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should navigate to the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 56600,
  "status": "passed"
});
formatter.match({
  "location": "stepdef.user_clicks_on_the_login_link()"
});
formatter.result({
  "duration": 10700,
  "status": "passed"
});
formatter.match({
  "location": "stepdef.user_should_navigate_to_the_login_page()"
});
formatter.result({
  "duration": 28600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "testing the login panel with valid credentials",
  "description": "",
  "id": "login;testing-the-login-panel-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enters righ username",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters right password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user should be in the login home page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 44600,
  "status": "passed"
});
formatter.match({
  "location": "stepdef.user_enters_righ_username()"
});
formatter.result({
  "duration": 30700,
  "status": "passed"
});
formatter.match({
  "location": "stepdef.user_enters_right_password()"
});
formatter.result({
  "duration": 28700,
  "status": "passed"
});
formatter.match({
  "location": "stepdef.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 15200,
  "status": "passed"
});
formatter.match({
  "location": "stepdef.user_should_be_in_the_login_home_page()"
});
formatter.result({
  "duration": 11700,
  "status": "passed"
});
formatter.uri("mercuryData.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 4,
  "name": "Mercury sign up panel",
  "description": "",
  "id": "mercury-sign-up-panel",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Mercury sign up module testing with positive data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-testing-with-positive-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    },
    {
      "line": 6,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enters postive first name \"bob\" for positive data",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user enters last name  mercury sign up page \"vance\" for positive data",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters phone number \"32673476\" for positive data",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters email \"test@test.com\" for positive data",
  "keyword": "And "
});
formatter.match({
  "location": "mercuryStepdef.user_is_on_the_mercury_sign_up_page()"
});
formatter.result({
  "duration": 7693918700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bob",
      "offset": 32
    }
  ],
  "location": "mercuryStepdef.user_enters_postive_first_name_for_positive_data(String)"
});
formatter.result({
  "duration": 74815400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vance",
      "offset": 45
    }
  ],
  "location": "mercuryStepdef.user_enters_last_name_mercury_sign_up_page_for_positive_data(String)"
});
formatter.result({
  "duration": 65745100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32673476",
      "offset": 26
    }
  ],
  "location": "mercuryStepdef.user_enters_phone_number_for_positive_data(String)"
});
formatter.result({
  "duration": 48300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 19
    }
  ],
  "location": "mercuryStepdef.user_enters_email_for_positive_data(String)"
});
formatter.result({
  "duration": 25200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Mercury sign up module testing with negative data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-testing-with-negative-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@smoke"
    },
    {
      "line": 15,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user enters first name mercury sign up page \"3243\" for negative data",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters last name  mercury sign up page \"$%8\" for negative data",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user enters phone number \"326832\" for negative data",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user enters email \"test\" for negative data",
  "keyword": "And "
});
formatter.match({
  "location": "mercuryStepdef.user_is_on_the_mercury_sign_up_page()"
});
formatter.result({
  "duration": 7608400300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3243",
      "offset": 45
    }
  ],
  "location": "mercuryStepdef.user_enters_first_name_mercury_sign_up_page_for_negative_data(String)"
});
formatter.result({
  "duration": 83535900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$%8",
      "offset": 45
    }
  ],
  "location": "mercuryStepdef.user_enters_last_name_mercury_sign_up_page_for_negative_data(String)"
});
formatter.result({
  "duration": 59988200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "326832",
      "offset": 26
    }
  ],
  "location": "mercuryStepdef.user_enters_phone_number_for_negative_data(String)"
});
formatter.result({
  "duration": 42000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 19
    }
  ],
  "location": "mercuryStepdef.user_enters_email_for_negative_data(String)"
});
formatter.result({
  "duration": 34200,
  "status": "passed"
});
formatter.uri("mercuryfeaturetable.feature");
formatter.feature({
  "line": 1,
  "name": "Mercury sign up panel",
  "description": "",
  "id": "mercury-sign-up-panel",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Mercury sign up module with multiple sets of data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters first name with \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters last name with \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create an account",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user can close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ],
      "line": 12,
      "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;1"
    },
    {
      "cells": [
        "Micheael",
        "Jordan"
      ],
      "line": 13,
      "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;2"
    },
    {
      "cells": [
        "Bob",
        "Vance"
      ],
      "line": 14,
      "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;3"
    },
    {
      "cells": [
        "131313",
        "dfd"
      ],
      "line": 15,
      "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;4"
    },
    {
      "cells": [
        "basant",
        "Poudel"
      ],
      "line": 16,
      "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;5"
    },
    {
      "cells": [
        "test",
        "test"
      ],
      "line": 17,
      "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Mercury sign up module with multiple sets of data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters first name with \"Micheael\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters last name with \"Jordan\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create an account",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user can close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "mercuryStepdef.user_is_on_the_mercury_sign_up_page()"
});
formatter.result({
  "duration": 7638187000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Micheael",
      "offset": 29
    }
  ],
  "location": "mercuryStepdef.user_enters_first_name_with(String)"
});
formatter.result({
  "duration": 113814900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jordan",
      "offset": 28
    }
  ],
  "location": "mercuryStepdef.user_enters_last_name_with(String)"
});
formatter.result({
  "duration": 69831300,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_should_be_able_to_create_an_account()"
});
formatter.result({
  "duration": 19600,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_can_close_the_browser()"
});
formatter.result({
  "duration": 1770128000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Mercury sign up module with multiple sets of data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters first name with \"Bob\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters last name with \"Vance\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create an account",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user can close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "mercuryStepdef.user_is_on_the_mercury_sign_up_page()"
});
formatter.result({
  "duration": 7705027000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob",
      "offset": 29
    }
  ],
  "location": "mercuryStepdef.user_enters_first_name_with(String)"
});
formatter.result({
  "duration": 88873800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vance",
      "offset": 28
    }
  ],
  "location": "mercuryStepdef.user_enters_last_name_with(String)"
});
formatter.result({
  "duration": 73430900,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_should_be_able_to_create_an_account()"
});
formatter.result({
  "duration": 19400,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_can_close_the_browser()"
});
formatter.result({
  "duration": 1746173200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Mercury sign up module with multiple sets of data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters first name with \"131313\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters last name with \"dfd\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create an account",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user can close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "mercuryStepdef.user_is_on_the_mercury_sign_up_page()"
});
formatter.result({
  "duration": 7685517400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "131313",
      "offset": 29
    }
  ],
  "location": "mercuryStepdef.user_enters_first_name_with(String)"
});
formatter.result({
  "duration": 98735000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dfd",
      "offset": 28
    }
  ],
  "location": "mercuryStepdef.user_enters_last_name_with(String)"
});
formatter.result({
  "duration": 66538200,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_should_be_able_to_create_an_account()"
});
formatter.result({
  "duration": 19600,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_can_close_the_browser()"
});
formatter.result({
  "duration": 1794302600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Mercury sign up module with multiple sets of data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters first name with \"basant\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters last name with \"Poudel\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create an account",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user can close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "mercuryStepdef.user_is_on_the_mercury_sign_up_page()"
});
formatter.result({
  "duration": 7624522700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "basant",
      "offset": 29
    }
  ],
  "location": "mercuryStepdef.user_enters_first_name_with(String)"
});
formatter.result({
  "duration": 91990700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Poudel",
      "offset": 28
    }
  ],
  "location": "mercuryStepdef.user_enters_last_name_with(String)"
});
formatter.result({
  "duration": 60837000,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_should_be_able_to_create_an_account()"
});
formatter.result({
  "duration": 24600,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_can_close_the_browser()"
});
formatter.result({
  "duration": 1759709300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Mercury sign up module with multiple sets of data",
  "description": "",
  "id": "mercury-sign-up-panel;mercury-sign-up-module-with-multiple-sets-of-data;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the mercury sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters first name with \"test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters last name with \"test\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create an account",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user can close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "mercuryStepdef.user_is_on_the_mercury_sign_up_page()"
});
formatter.result({
  "duration": 7621767300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 29
    }
  ],
  "location": "mercuryStepdef.user_enters_first_name_with(String)"
});
formatter.result({
  "duration": 73823900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 28
    }
  ],
  "location": "mercuryStepdef.user_enters_last_name_with(String)"
});
formatter.result({
  "duration": 63091900,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_should_be_able_to_create_an_account()"
});
formatter.result({
  "duration": 13000,
  "status": "passed"
});
formatter.match({
  "location": "mercuryStepdef.user_can_close_the_browser()"
});
formatter.result({
  "duration": 2242100100,
  "status": "passed"
});
formatter.uri("signupTest.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the signup functionalites",
  "description": "",
  "id": "testing-the-signup-functionalites",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "signup module",
  "description": "",
  "id": "testing-the-signup-functionalites;signup-module",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on the signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.user_is_on_the_signup_page()"
});
formatter.result({
  "duration": 9048163200,
  "status": "passed"
});
formatter.uri("sigup.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Testing the Signup",
  "description": "",
  "id": "testing-the-signup",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 21,
  "name": "signup testing with valid credentials",
  "description": "",
  "id": "testing-the-signup;signup-testing-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user is on the signup page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enters username",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user enters new password",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user enters first name",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user enters last name",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user clicks on the signup button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "new account for the user should be created",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user should navigate to the new account page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.user_is_on_the_signup_page()"
});
formatter.result({
  "duration": 8898754800,
  "status": "passed"
});
formatter.match({
  "location": "stepdef.user_enters_username()"
});
formatter.result({
  "duration": 850646200,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[expectedTitle]\u003e but was:\u003c[Sign Up for Facebook | Facebook]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDef.stepdef.user_enters_username(stepdef.java:42)\r\n\tat ✽.When user enters username(sigup.feature:23)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepdef.user_enters_new_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdef.user_enters_first_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdef.user_enters_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdef.user_clicks_on_the_signup_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdef.new_account_for_the_user_should_be_created()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdef.user_should_navigate_to_the_new_account_page()"
});
formatter.result({
  "status": "skipped"
});
});