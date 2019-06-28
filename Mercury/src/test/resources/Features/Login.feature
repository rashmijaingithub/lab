@FunctionalTest
Feature: Login
@SmokeTest
Scenario Outline: Login to Mercury Application
Given user loads application
When enter "<username>" and "<password>"

Then User should be logged in

Examples: 
|username|password|
|mercury|mercury|
|mercury2|mercury2|


@RegressionTest
Scenario Outline: Invalid password to Mercury Application
Given user loads application
When enter "<username>" and "<password>"

Then User should be logged in

Examples: 
|username|password|
|mercury|sdfdfd|

@SmokeTest
Scenario: Click on the line
Given user loads application
When user click on Link
