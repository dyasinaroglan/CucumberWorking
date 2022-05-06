Feature:
  Scenario: Given Drag and Drop
    Given Given "http://demo.guru99.com/test/drag_drop.html" ana sayfasina gidelim
    When Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    And Drag and drop the SALES button to the Account section in CREDIT SIDE
    And Drag and drop the BANK button to the Account section in DEBIT SIDE
    And Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    Then PerfectButton visibilty do test
    And close page