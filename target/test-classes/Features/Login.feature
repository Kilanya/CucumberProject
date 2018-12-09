Feature: LoginFeature

Scenario: Valid Login 
Given I open browser 
And I navigate to the FreeCrm
When I enter valid username and password 
And I click login button
Then I successfully logged in

Scenario: Ivalid Login
Given I open browser 
And I navigtae to the FreeCrm
When I eneter invalid username and password 
And I click login button 
Then I still see sign up link 

