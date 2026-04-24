Feature: Add User
  As a system administrator
  I want to be able to add a new user
  In order to manage access to the platform

  Background:
    Given the administrator is authenticated in the system
    And is on the users page and clicks the Add User button

  Scenario: Successfully add a user
    When I enter the user's data:
      | field            | value                 |
      | role             | Admin                 |
      | first_name       | Miguel                |
      | last_name        | Prueba                |
      | second_last_name | Prueba                |
      | city             | Medellin              |
      | number           | 300300300             |
      | email            | prueba@prueba.com     |
      | address          | KR 00 CL 000          |
    And I click "Create"
    Then it should be verified that the user "Miguel Prueba" was created successfully
    And the user should appear in the list with the role "Admin"

    Examples:
      | first_name | last_name | second_last_name | role  | status
      | Albeiro    | Ramos     | Villalba         | Admin | active
      | Juan       | Pérez     | Garcia           | Admin | active
      | Miguel     | Prueba    | Prueba           | Admin | active