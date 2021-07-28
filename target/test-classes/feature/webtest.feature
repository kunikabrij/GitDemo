Feature: web test

#Background: Net connection should be there

@MyTest
Scenario: Login with UserName and password and hit the sign in button
	Given Internet connection is there
	When UserName is "jaiswalkunika@gmail.com" and password is "9437212557"
	Then FaceBook Home page should be displayed
@MyTest	
Scenario Outline: Login with UserName and passord and hit the sign in button
	Given Internet connection is there
	When UserName is <username> and password is <password>
	Then FaceBook Home page should be displayed
	
Examples:
|username               |password  |
|jaiswalkunika@gmail.com|9437212557|

#Feature: Qaclick academy practise

