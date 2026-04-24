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
        | email    | juanesyt7@gmail.com        |
        | password | &zA#hs5fARmE               |


    Then the user should be successfully authenticated

