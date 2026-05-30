Feature: TutorialsNinja Ecommerce Functionality


Scenario: Verify Complete Ecommerce Workflow

Given user opens TutorialsNinja website

When user registers with valid details
Then Registration Passed

When user clicks logout after registration
Then Logout After Registration Passed

When user logs in with valid credentials
Then Login Passed

When user searches for a product
Then Search Passed

When user adds product to cart
Then Add To Cart Passed

When user removes product from cart
Then Remove Cart Passed

When user clicks logout
Then Logout Passed


