Feature: Car Create

  Scenario: Create new car
    Given user is on login page "https://qa1.vytrack.com/user/login"
    And user logs in as store manager
      | username | storemanager85 |
      | password | UserUser123    |
    When user navigates to "Fleet" then to "Vehicles"
    And user click on "Create Car" button
    Then user adds new car information:
      | License Plate | Driver      | Location        | Model Year | Color |
      | TestPlates    | Test Driver | Washington D.C. | 2020       | Black |
      | SuperMan      | Cool Driver | Texas           | 2019       | Red   |