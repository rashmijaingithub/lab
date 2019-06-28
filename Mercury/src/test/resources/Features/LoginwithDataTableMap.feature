Feature: LoginWithDataTableMap
@smoke
Scenario: Login to Mercury Application
Given user loads application
When enter username and password
|username|password|
|mercury|mercury|

Then User should be logged in

