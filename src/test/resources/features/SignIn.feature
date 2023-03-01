Feature: Retail SignIn feature 
 
 Background: 
      Given User is on retail website
      When User click on Sign in option 
    
  @Regresion @FunctionalTestCases 
    Scenario: Verify user can sign in into Retail Application
      And User enter email 'phantom.test@gmail.com' and password 'Tek@12345'
      And User click on login button
      Then User should be logged in into Account  
  
   @tc001
   Scenario Outline: Verify user can sign in into Retail Application
      And User enter email '<email>' and password '<password>'
      And User click on login button
      Then User should be logged in into Account
      
      Examples: 
        | email              | password |
        | ashraf1@gmail.com  | Tek@9999 |
        | ashraf2@gmail.com  | Tek@8888 |
        | ashraf3@gmail.com  | Tek@7777 |
     

  @dryRun @Regression @registerAccount 
  Scenario: Verify user can create an account into Retail Website
        And User click on Create New Account button
        And User fill the signUp information with below data
          | name    | email                          | password  | confirmPassword |
          | phantom | phan.ca7602@tekschool.us    | Tek@12345 | Tek@12345       |
        And User click on SignUp button
        Then User should be logged into account page

