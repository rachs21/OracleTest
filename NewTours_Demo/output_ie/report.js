$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("alogin.feature");
formatter.feature({
  "line": 2,
  "name": "To Login New Tours Company Webpage",
  "description": " As an user of the New Tours \r\n I want to Login to webpage of New Tours\r\n In order to Test Login functionality",
  "id": "to-login-new-tours-company-webpage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Successful Login",
  "description": "",
  "id": "to-login-new-tours-company-webpage;successful-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I enter Username as \"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see the title as \"Find a Flight: Mercury Tours:\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "to-login-new-tours-company-webpage;successful-login;",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ],
      "line": 19,
      "id": "to-login-new-tours-company-webpage;successful-login;;1"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 20,
      "id": "to-login-new-tours-company-webpage;successful-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5186763217,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "Successful Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Homepage page on URL \"http://newtours.demoaut.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see \"Welcome: Mercury Tours\"  as page title",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://newtours.demoaut.com",
      "offset": 34
    }
  ],
  "location": "Login.i_am_on_the_Homepage_page_on_URL(String)"
});
formatter.result({
  "duration": 1320143139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome: Mercury Tours",
      "offset": 14
    }
  ],
  "location": "Login.i_should_see_as_page_title(String)"
});
formatter.result({
  "duration": 29149804,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Successful Login",
  "description": "",
  "id": "to-login-new-tours-company-webpage;successful-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I enter Username as \"mercury\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter Password as \"mercury\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see the title as \"Find a Flight: Mercury Tours:\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 21
    }
  ],
  "location": "Login.i_enter_Username_as(String)"
});
formatter.result({
  "duration": 806634099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 21
    }
  ],
  "location": "Login.i_enter_Password_as(String)"
});
formatter.result({
  "duration": 669269630,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_click_on_the_Login_button()"
});
formatter.result({
  "duration": 993332610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Flight: Mercury Tours:",
      "offset": 27
    }
  ],
  "location": "Login.i_should_see_the_title_as(String)"
});
formatter.result({
  "duration": 5039560767,
  "status": "passed"
});
formatter.after({
  "duration": 2420605585,
  "status": "passed"
});
formatter.uri("bookFlight.feature");
formatter.feature({
  "line": 2,
  "name": "To Test Ticket Booking for New Tours Company",
  "description": " As an user of the New Tours \r\n I want to book Flight Tickets \r\n In order to Test Ticket Booking feature for New Tours Company",
  "id": "to-test-ticket-booking-for-new-tours-company",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BookFlight"
    }
  ]
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Successful Flight Booking",
  "description": "",
  "id": "to-test-ticket-booking-for-new-tours-company;successful-flight-booking",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I select number of passengers \"\u003cPassengers\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I select Departing From as \"\u003cDepartPort\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select Departure Month \"\u003cDepartMonth\u003e\" and Day as \"\u003cDepartDay\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select Arriving In as \"\u003cArrivalPort\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select Arrival Month \"\u003cArrivalMonth\u003e\" and Day as \"\u003cArrivalDay\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on the find Flights Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click on the reserve Flights Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I enter FirstName as \"\u003cFirstName\u003e\" and LastName as \"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter Card Number as \"\u003cCardNum\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on the Secure Purchase button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should see Flight confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "to-test-ticket-booking-for-new-tours-company;successful-flight-booking;",
  "rows": [
    {
      "cells": [
        "Passengers",
        "DepartPort",
        "DepartMonth",
        "DepartDay",
        "ArrivalPort",
        "ArrivalMonth",
        "ArrivalDay",
        "FirstName",
        "LastName",
        "CardNum"
      ],
      "line": 29,
      "id": "to-test-ticket-booking-for-new-tours-company;successful-flight-booking;;1"
    },
    {
      "cells": [
        "1",
        "London",
        "April",
        "20",
        "Paris",
        "April",
        "30",
        "Customer",
        "One",
        "1000"
      ],
      "line": 30,
      "id": "to-test-ticket-booking-for-new-tours-company;successful-flight-booking;;2"
    },
    {
      "cells": [
        "1",
        "Zurich",
        "May",
        "20",
        "Portland",
        "May",
        "30",
        "Customer",
        "Two",
        "1001"
      ],
      "line": 31,
      "id": "to-test-ticket-booking-for-new-tours-company;successful-flight-booking;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3881653723,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "Successful Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I navigate to the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I submit username and password",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BookFlight.i_navigate_to_the_home_page()"
});
formatter.result({
  "duration": 1359859646,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_submit_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2445781998,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_should_be_logged_in()"
});
formatter.result({
  "duration": 5035417356,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Successful Flight Booking",
  "description": "",
  "id": "to-test-ticket-booking-for-new-tours-company;successful-flight-booking;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BookFlight"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I select number of passengers \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I select Departing From as \"London\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select Departure Month \"April\" and Day as \"20\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select Arriving In as \"Paris\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select Arrival Month \"April\" and Day as \"30\"",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on the find Flights Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click on the reserve Flights Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I enter FirstName as \"Customer\" and LastName as \"One\"",
  "matchedColumns": [
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter Card Number as \"1000\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on the Secure Purchase button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should see Flight confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "BookFlight.i_select_number_of_passengers(String)"
});
formatter.result({
  "duration": 603138372,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 28
    }
  ],
  "location": "BookFlight.i_select_Departing_From_as(String)"
});
formatter.result({
  "duration": 855134551,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April",
      "offset": 26
    },
    {
      "val": "20",
      "offset": 45
    }
  ],
  "location": "BookFlight.i_select_Departure_Month_and_Day_as(String,String)"
});
formatter.result({
  "duration": 1415780753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paris",
      "offset": 25
    }
  ],
  "location": "BookFlight.i_select_Arriving_In_as(String)"
});
formatter.result({
  "duration": 837714819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April",
      "offset": 24
    },
    {
      "val": "30",
      "offset": 43
    }
  ],
  "location": "BookFlight.i_select_Arrival_Month_and_Day_as(String,String)"
});
formatter.result({
  "duration": 1417621525,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_click_on_the_find_Flights_Continue_button()"
});
formatter.result({
  "duration": 961983251,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_click_on_the_reserve_Flights_Continue_button()"
});
formatter.result({
  "duration": 3009884391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer",
      "offset": 22
    },
    {
      "val": "One",
      "offset": 49
    }
  ],
  "location": "BookFlight.i_enter_FirstName_as_and_LastName_as(String,String)"
});
formatter.result({
  "duration": 2083172126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000",
      "offset": 24
    }
  ],
  "location": "BookFlight.i_enter_Card_Number_as(String)"
});
formatter.result({
  "duration": 634498888,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_click_on_the_Secure_Purchase_button()"
});
formatter.result({
  "duration": 3013226341,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_should_see_Flight_confirmation_page()"
});
formatter.result({
  "duration": 1162364167,
  "status": "passed"
});
formatter.after({
  "duration": 1196124158,
  "status": "passed"
});
formatter.before({
  "duration": 3380203194,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "Successful Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I navigate to the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I submit username and password",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BookFlight.i_navigate_to_the_home_page()"
});
formatter.result({
  "duration": 953081944,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_submit_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2465030900,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_should_be_logged_in()"
});
formatter.result({
  "duration": 5032198124,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Successful Flight Booking",
  "description": "",
  "id": "to-test-ticket-booking-for-new-tours-company;successful-flight-booking;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BookFlight"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I select number of passengers \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I select Departing From as \"Zurich\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select Departure Month \"May\" and Day as \"20\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select Arriving In as \"Portland\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select Arrival Month \"May\" and Day as \"30\"",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on the find Flights Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I click on the reserve Flights Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I enter FirstName as \"Customer\" and LastName as \"Two\"",
  "matchedColumns": [
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter Card Number as \"1001\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on the Secure Purchase button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should see Flight confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    }
  ],
  "location": "BookFlight.i_select_number_of_passengers(String)"
});
formatter.result({
  "duration": 566422881,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zurich",
      "offset": 28
    }
  ],
  "location": "BookFlight.i_select_Departing_From_as(String)"
});
formatter.result({
  "duration": 855990900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "May",
      "offset": 26
    },
    {
      "val": "20",
      "offset": 43
    }
  ],
  "location": "BookFlight.i_select_Departure_Month_and_Day_as(String,String)"
});
formatter.result({
  "duration": 1650855212,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Portland",
      "offset": 25
    }
  ],
  "location": "BookFlight.i_select_Arriving_In_as(String)"
});
formatter.result({
  "duration": 854665990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "May",
      "offset": 24
    },
    {
      "val": "30",
      "offset": 41
    }
  ],
  "location": "BookFlight.i_select_Arrival_Month_and_Day_as(String,String)"
});
formatter.result({
  "duration": 1714450443,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_click_on_the_find_Flights_Continue_button()"
});
formatter.result({
  "duration": 998431884,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_click_on_the_reserve_Flights_Continue_button()"
});
formatter.result({
  "duration": 3010157048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer",
      "offset": 22
    },
    {
      "val": "Two",
      "offset": 49
    }
  ],
  "location": "BookFlight.i_enter_FirstName_as_and_LastName_as(String,String)"
});
formatter.result({
  "duration": 2069084081,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1001",
      "offset": 24
    }
  ],
  "location": "BookFlight.i_enter_Card_Number_as(String)"
});
formatter.result({
  "duration": 617895790,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_click_on_the_Secure_Purchase_button()"
});
formatter.result({
  "duration": 3010526541,
  "status": "passed"
});
formatter.match({
  "location": "BookFlight.i_should_see_Flight_confirmation_page()"
});
formatter.result({
  "duration": 1080118899,
  "status": "passed"
});
formatter.after({
  "duration": 1657403453,
  "status": "passed"
});
});