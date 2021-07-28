Feature: Qaclick academy practise
@SmokeTest
Scenario: search for a vegetable
Given User is on greenkart home page
When User searchs for "Cucumber" in the search box
Then "Cucumber" results are displayed

@seleniumTest
Scenario Outline: search for a vegetable and add those to the checkout page
Given User is on greenkart home page
When User search for <Vegetables> in the search box
And added items to the bag
And proceed for the check out
Then Verify selected <Vegetables> is displayed in the checkout page

Examples:
|Vegetables|
|Beetroot  |
|Brinjal	 |