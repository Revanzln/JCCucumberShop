Feature: Checkout page test
  Scenario: Checkout product from cart
    When User click button view cart
    And User click button proceed to checkout
    And User enter firstname
    And User enter lastname
    And User enter companyname
    And User select country
    And User enter address1
    And User enter address2
    And User enter town
    And User select province
    And User enter postcode
    And User enter phone number
    And User enter email address
    And User enter order comments
    And User click checkbox terms
    And User click button place order
    Then User get text success order