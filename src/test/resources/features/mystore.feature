Feature: My store
  This is example of using Cucumber-JVM with TestNG and Selenium

  Scenario: launch my store
    Given I navigate for the my store link
    When I select "Faded Short Sleeve T-shirts" product on add cart button
    And I click the check out button on pop up
    Then I see order list page
