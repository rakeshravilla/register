Feature: Login

@Test
Scenario: user can do the successful login

Given user navigate to browser
Given user is on the login page
 When  user provides the correct credentials
 Then  user rendered to home page