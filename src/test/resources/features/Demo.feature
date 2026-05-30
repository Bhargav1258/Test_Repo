Feature: TutorialsNinja Ecommerce Functionality

Background:
  Given user opens TutorialsNinja website


@smoke @login
Scenario: User Login Test

  When user logs in with valid credentials
  Then Login Passed


@regression @search
Scenario: Product Search Test

  When user searches for a product
  Then Search Passed


@regression @cart
Scenario: Add Product To Cart Test

  When user adds product to cart
  Then Add To Cart Passed


@regression @cart
Scenario: Remove Product From Cart Test

When user adds product to cart
And user removes product from cart
Then Remove Cart Passed  

@smoke @logout
Scenario: Logout Test

  When user clicks logout
  Then Logout Passed