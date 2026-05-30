Feature: TutorialsNinja Ecommerce Functionality

@smoke @register
Scenario: User registration
  Given user opens TutorialsNinja website
  When user registers with valid details
  Then Registration Passed


@smoke @logout
Scenario: Logout after registration
  Given user opens TutorialsNinja website
  When user clicks logout after registration
  Then Logout After Registration Passed


@smoke @login
Scenario: User login
  Given user opens TutorialsNinja website
  When user logs in with valid credentials
  Then Login Passed


@regression @search
Scenario: Product search
  Given user opens TutorialsNinja website
  When user searches for a product
  Then Search Passed


@regression @cart
Scenario: Add product to cart
  Given user opens TutorialsNinja website
  When user adds product to cart
  Then Add To Cart Passed


 @cart
Scenario: Remove product from cart
  Given user opens TutorialsNinja website
  When user removes product from cart
  Then Remove Cart Passed


 @logout
Scenario: Final logout
  Given user opens TutorialsNinja website
  When user clicks logout
  Then Logout Passed