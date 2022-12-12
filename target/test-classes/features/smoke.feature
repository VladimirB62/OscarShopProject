Feature: OscarShop Registration
  Register in the website to see the user area

  Scenario: Successfull Registration
    Given Navigate to Home Page
    When Click on Login or register button
    Then Login or register page displayed

    When Enter the valid credentials and confirm password
    And Click Register button
    Then Logout button displayed

    When Click on Logout button
    Then Login or register button displayed

    When Click on Login or register button
    Then  Login or register page displayed

    When Enter the valid login credentials
    And Click Log in button
    Then Logout button displayed

    When Click on All products link
    Then All products page displayed

    When Click on first item's Add to basket button
    And Click on View basket button
    Then Basket page displayed

    When Click on Proceed to checkout button
    Then Shipping address page displayed

    When Enter required fields
    And Click on Continue button
    Then Payment page displayed

    When Click on Continue button1
    Then Preview order page displayed

    When Click on Place order button
    Then Confirmation page with the item displayed




