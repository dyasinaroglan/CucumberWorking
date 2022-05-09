Feature: Login as driver

  Scenario: login types Data Table
    Given user is on the login page "https://qa1.vytrack.com/user/login"
    When user logs in as driver with following credentials
      | username | user160     |
      | password | UserUser123 |
    #DataTable--> sen bunu yaparsan orada map türünden bir list yada List'ın Listi yapıp get(" ") ile başlıkları çağırırsın
    Then user verifies that "Quick Launchpad" page subtitle is displayed

