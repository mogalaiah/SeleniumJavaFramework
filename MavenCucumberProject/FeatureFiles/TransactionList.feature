@Regression,Smoke
Feature: Transaction List Functionality

  @Regression
  Scenario: Verify Transaction List Is Displayed
    Given user Navigate to URL "http://demo.guru99.com/Agile_Project/Agi_V1/index.php"
    When user enter userName as "1303" and passWord as "Guru99"
    When user click on submit button
    Then user verify home page as "Guru99 Bank" is displayed
    When user click on Ministatement link
    Then user verify Ministatement Form is displayed
    When user select account number from account dropdown list
    When user click on submit
    Then user verify transaction list is displayed
    Then user click on logOut from Application
    When user close the browser

  @Regression
  Scenario Outline: Verify Transaction List Is Displayed With Data Driven
    Given user Navigate to URL "http://demo.guru99.com/Agile_Project/Agi_V1/index.php"
    When user enter userName as "<UserName>" and passWord as "<PassWord>"
    When user click on submit button
    Then user verify home page as "Guru99 Bank" is displayed
    When user click on Ministatement link
    Then user verify Ministatement Form is displayed
    When user select account number from account dropdown list
    When user click on submit
    Then user verify transaction list is displayed
    Then user click on logOut from Application
    When user close the browser

    Examples: 
      | UserName | PassWord | status  |
      |     1303 | Guru99   | success |
