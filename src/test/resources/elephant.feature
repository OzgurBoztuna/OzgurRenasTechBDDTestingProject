Feature: The user wants to buy a toy elephant
  Background: The user goes to URL
      Given The user goes to URL

  Scenario: The user wants to verify the header
   # Given The user goes to URL
    When The user wants to verify header "Mother Elephant With Babies Soft Toy"




  Scenario: The user want to check the price
      #Given The user goes to URL
      When The user wants to verify toy price as "$20"

      Scenario: The user wants to check payment url
      #  Given The user goes to URL
        When The user wants tp verify URL contains "payment-gateway"

  Scenario:The user wants to buy 5 toys
  #  Given The user goes to URL
    When The user wants to click the quantity button
    And The user wants to select "5"
    Then The user wants to click Buy Now button
    Then The user wants to enter following credit card information
      |CNumber|44444433344333456433|
      |EMonth | 11             |
      |EYear  |2029            |
      |CVVCode| 778            |
    Then The user wants to click Pay button
    Then The user  should be able to verify "Payment successfull!"

  Scenario Outline: buying
   # Given The user goes to URL
    When The user wants to click the quantity button
    And The user want to buy toys according to given "<Quantity>"
    Then The user wants to click Buy Now button
    Then The user wants to enter following credit card information
      |CNumber|44444433344333456433|
      |EMonth | 11             |
      |EYear  |2029            |
      |CVVCode| 778            |
    Then The user wants to click Pay button
    Then The user  should be able to verify "Payment successfull!"

    Examples:
      |Quantity |
      |5        |
      |8        |
      |9        |
      |2        |
      |4        |


