Feature: SauseDemo Application

  Scenario: LoginFunctionality
    Given user is on login page
    When user enter valid username and password
    And click on login button

  Scenario: Product Page Functionality
    Given user is on productpage
    When user sorts poroduct and add products
    And click on shoping cart container button
