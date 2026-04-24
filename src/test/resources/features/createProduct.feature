# language: en
# author: EdwinQuenguan

Feature: Create Product
  As a system administrator
  I want to be able to add a new product
  In order to manage inventory

  Background:
    Given the administrator is authenticated in the system
      | field    | value               |
      | email    | juanesyt7@gmail.com |
      | password | &zA#hs5fARmE        |
    And is on the products page and clicks the Add Product button

  @createProduct
  Scenario Outline: Successfully add a product
    When I enter the product's data:
      | field           | value             |
      | entry_order     | <entry_order>     |
      | category        | <category>        |
      | subcategory     | <subcategory>     |
      | brand           | <brand>           |
      | model           | <model>           |
      | serial          | <serial>          |
      | warranty_period | <warranty_period> |
    And I click "Create"
    Then it should be verified that the product "<brand> <subcategory>" was created successfully
    And the product should appear in the list with the other products

    Examples:
      | entry_order | category  | subcategory | brand  | model                     | serial | warranty_period |
      | INP00001    | computers | laptops     | Lenovo | Lenovo ThinkPad X1 Carbon | nuevo  | 24 Months       |