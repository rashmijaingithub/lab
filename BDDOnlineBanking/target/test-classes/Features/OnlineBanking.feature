Feature: Online Banking 

Background: Application loads and login with Valid username and password
Given user loadsApplication
When User enter valid "jsmith" and "Demo1234"

@Regression
Scenario: TC_001_Login Page: Login page validation 
Then Verify AltoroMutual logo image is displayed in top left
Then Verify that following four tabs are displayed at the top
|ONLINE BANKING LOGIN|
|PERSONAL|
|SMALL BUSINESS|
|INSIDE ALTORO MUTUAL|

@Smoke
Scenario Outline: TC_001_Login Page:Login Validations for valid and invalid users
Then Logoff from the System
When User enter valid "<username>" and "<password>"
Then Validate the message "<Message>"
Examples:
|username|password|Message|
|invalid|invalid|Invalid|
|jsmith|Demo1234|Valid|

@Regression
Scenario: TC_002_Online Banking Home: Account History 

Then Select bank account in View Account Details dropdown and click on GO button
And Verify Account Information page is displayed
Then Account number displayed in heading Account History acct number is same as bank account selected in above 
And Verify that current date is displayed in Balance Detail table (Ending balance as of <Date>)


@Smoke
Scenario Outline: TTC_003_Transfer Funds Page: Transfer fund
Then Click on Transfer Funds link in left hand navigation section
And Verify that Transfer Funds page is displayed
Then Select From Account, To Account and <amount> to Transfer and click on Transfer Money button
And Verify that a message is displayed with correct amount and from/to account details
Then Logoff from the System
Examples:
|amount|
|100|