Feature: Car Create

  Background:
    Given user is on login page "https://qa1.vytrack.com/user/login"
    And user logs in as store manager
      | username | storemanager85 |
      | password | UserUser123    |

  Scenario: Create new car
    When user navigates to "Fleet" then to "Vehicles"
    And user click on "Create Car" button
    Then user adds new car information:
      | License Plate | Driver      | Location        | Model Year | Color |
      | TestPlates    | Test Driver | Washington D.C. | 2020       | Black |
      | SuperMan      | Cool Driver | Texas           | 2019       | Red   |


  Scenario: Verify column names
    When user navigates to Activities button
    And user navigates to Calender Events button
    Then user verifies that column names are displayed

      | TITLE             |
      | CALENDER          |
      | START             |
      | END               |
      | RECURRENT         |
      | RECURRENCE        |
      | INVITATION STATUS |

