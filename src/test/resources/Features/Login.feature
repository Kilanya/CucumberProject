Feature: LoginFeature
#command

Scenario: Valid Login 
Given I open browser 
And I navigate to the FreeCrm
#When I enter valid username and password 
When I enter "Kilany" and "Asmaa456"
And I click login button
Then I successfully logged in
And I close browser 

Scenario: Ivalid Login
Given I open browser 
And I navigtae to the FreeCrm
#When I eneter invalid username and password 
When I enter "Hello" and "World"
And I click login button 
Then I still see sign up link 
And I close browser 

Scenario: Ivalid Login
Given I open browser 
And I navigate to the FreeCrm
#When I enter valid username and invalid password 
When I enter "Kilany" and "World"
And I click login button
Then I still see sign up link  
And I close  browser 

