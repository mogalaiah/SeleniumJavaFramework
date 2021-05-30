
@Regression,Smoke
Feature: Login Functionality

@Regression
  Scenario Outline: Login With Valid UserName and Password
   
    Given user lunch chrome browser
    And user Navigate to URL "http://demo.guru99.com/Agile_Project/Agi_V1/index.php"
    When user enter userName as <UserName> and password as <Password> 
    When user click on submit button
    Then user verify home page as "Demo Site" is displayed

    Examples: 
      | UserName  | Password | status  |
      | 1303 			| Guru99 	 | success |
 