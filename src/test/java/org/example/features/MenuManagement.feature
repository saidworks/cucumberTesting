Feature: Menu Management
  @SmokeTest
  Scenario: Add a menu item
    Given I have a menu with name "Cucumber Sandwich" and price $20
    When I add that menu item
    Then Menu Item with name "Cucumber Sandwich" should be added

  @RegularTest
  Scenario: Add another item
    Given I have a menu with name "Cucumber Salad" and price $12
    When I add that menu item
    Then Menu Item with name "Cucumber Salad" should be added

  @NightlyBuildTest @RegularTest
  Scenario: add a third item
    Given I have a menu with name "Chicken Sandwich" and price $20
    When I add that menu item
    Then Menu Item with name "Chicken Sandwich" should be added