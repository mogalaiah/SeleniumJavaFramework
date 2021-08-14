@Regression,Smoke 
Feature: MiniStatment Functionality 

Background: MiniStatment Validation through Background keyword 
	Given user Navigate to URL "http://demo.guru99.com/Agile_Project/Agi_V1/index.php" 
	
Scenario: Verify MiniStatment Is Display 
	When user enter userName as "1303" and passWord as "Guru99" 
	When user click on submit button 
	Then user verify home page as "Guru99 Bank" is displayed 
	When user click on Ministatement link 
	Then user verify Ministatement Form is displayed 
	Then user click on logOut from Application 
	When user close the browser 
	
@Regression,smoke 
Scenario: Login With Valid UserName and Password through Data Table 
	When user enter userName and passWord 
		|UserName|PassWord|
		|1303		 |Guru99  |
	When user click on submit button 
	Then user verify home page as "Guru99 Bank" is displayed 
	When user click on Ministatement link 
	Then user verify Ministatement Form is displayed 
	Then user click on logOut from Application 
	When user close the browser 
	
Scenario Outline: Verify MiniStatment Is Display With Data Driven 
	When user enter userName as "<UserName>" and passWord as "<PassWord>" 
	When user click on submit button 
	Then user verify home page as "Guru99 Bank" is displayed 
	When user click on Ministatement link 
	Then user verify Ministatement Form is displayed 
	Then user click on logOut from Application 
	When user close the browser 
	
	Examples: 
		| UserName | PassWord | status  |
		|     1303 | Guru99   | success |
