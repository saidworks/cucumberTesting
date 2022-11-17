Feature: Datatable

  @ListOfStrings
  Scenario Outline: Bill Amount Generation
    Given I placed an order for the following <item> with <quantity> and <price> <currency>
    When I generate the bill
    Then a bill for $40 should be generated
    Examples:
      | item                |  | quantity | price | currency |
      | "Cucumber sandwich" |  | 2        | 40    | "$"      |
      | "Carrot salad"      |  | 3        | 30    | "$"      |