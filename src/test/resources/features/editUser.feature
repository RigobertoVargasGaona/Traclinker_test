Feature: edit user
  The user must be registered in order to edit their personal data.

  Background:
    Given the administrator is authenticated in the system
      | field    | value               |
      | email    | juanesyt7@gmail.com |
      | password | &zA#hs5fARmE        |
    And is on the users page and clicks the Add User button

  @editUser
  Scenario: User edit successful
    Given The user is on the profile screen.
    When Enter the personal data you wish to edit.
      |Rol             |Admin            |
      |Nombre          |Miguel           |
      |Primer Apellido |Contreras        |
      |Segundo Apellido|Aguilarrrr       |
      |Ciudad          |Cartagena        |
      |Nuemro          |3003003030       |
      |Email           |pepeito@gmail.com|
      |Direccion       |KR 124 #34'12    |
    And i click save
    Then It is verified that the information has been updated correctly.