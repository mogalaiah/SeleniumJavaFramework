Feature: Login Functionality 

Background: Login Functionality Through Background Keyword 
	Given user Navigate to URL "http://demo.guru99.com/Agile_Project/Agi_V1/index.php" 
	
@Regression 
Scenario: Login With Valid UserName and Password 
	When user enter userName as "1303" and passWord as "Guru99" 
	When user click on submit button 
	Then user verify home page as "Guru99 Bank" is displayed 
	When user click on logOut from Application 
	When user close the browser 
	
@Regression,smoke 
Scenario: Login With Valid UserName and Password through Data Table 
	When user enter userName and passWord 
		|UserName|PassWord|
		|1303		 |Guru99  |
	When user click on submit button 
	Then user verify home page as "Guru99 Bank" is displayed 
	When user click on logOut from Application 
	When user close the browser 
	
@Smoke 
Scenario Outline: Login With Valid UserName and Password with Data Driven 
	When user enter userName as "<UserName>" and passWord as "<PassWord>" 
	When user click on submit button 
	Then user verify home page as "Guru99 Bank" is displayed 
	Then user click on logOut from Application 
	When user close the browser 
	
	Examples: 
		| UserName | PassWord | status  |
		|     1303 | Guru99   | success |
		
		
