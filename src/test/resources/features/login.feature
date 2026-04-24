#language: en
#author: RigobertoVargas

Feature: User Login
    As a registered user
    I want to log in to the application
    So that I can access my account

   @authentication
   Scenario: Verify  succesful authentication on Traclinker
     Given the user is on login page
     When user enter valid credentials (email and password)
        | field    | value                      |
        | email    | profealbeiro2020@gmail.com |
        | password | 12345                      |


    Then the user should be successfully authenticated

