Feature: LoginWithDataTable
@smoke
Scenario: Login to Mercury Application
Given user loads application
When enter username and password
|mercury|mercury|

Then User should be logged in

