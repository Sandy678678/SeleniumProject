Feature: To add product to cart and check out in Amazon
Scenario Outline: Adding product to cart and checking out
Given User launches Amazon home page 
When User enters product name "<product>" in search box
And User clicks on search button
And User clicks on the product name
And User clicks on add to cart button
And User clicks on proceed to buy button
And user enters valid email address "<email>" in the Sign In textbox
And User clicks on Continue button
And User enters valid password "<password>" in Password textbox
And User clicks on Sign in button
And User clicks on the address checkbox
And User clicks on Use this address button
Then User takes screenshot of the page

Examples:

|product|email|password|
|Samsung Galaxy M53|s.deb1987.sd@gmail.com|Breaking@bad|