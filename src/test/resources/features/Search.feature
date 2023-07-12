Feature: Search functionality

Scenario: user searches for a valid product
Given user opens the application
When user enters valid product "shoes" into Seach box field
And user clicks on Search button
Then user should get valid product displayed in search results

Scenario: user searches for a invalid product
Given user opens the application
When user enters invalid product "belt" into Seach box field
And user clicks on Search button
Then user should get a message about no product matching

Scenario: user searches without any product
Given user opens the application
And user clicks on Search button
Then user should get a message about no product matching