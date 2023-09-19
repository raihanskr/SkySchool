Feature: Login Functionality
As a User
I want to login in daraz
So that I can see my home page


Scenario Outline: Verify Login Functionality
 Given I am in Daraz site
 When I click on My Account button
 Then I can see the login page 
 And I enter my "<loginId>" and "<password>"
 And I click on login button
 Then I click my home page name
 Then I click logOut button
 Then I can see the loginn page
 
 Examples:
 | loginId												|password |
 | 111111											    |222222		|
 | 111111											    |asdfg123 |
 |raihansarker2614@gmail.com	    |222222		|
 |raihansarker2614@gmail.com  	  |asdfg123 |
 
 #loginId  password
 #invalid  invalid
 #invalid  valid
 #valid    invalid
 #valid    valid
 
