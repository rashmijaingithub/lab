Feature: Registration

Scenario: Registration
Given user loads application

Then user registration using following info:

|first_nam|Rashmi|
|last_name|A|
|city|Bangalore|

Scenario: abc

Given user performs 1.5 and 3.5

Scenario: read calculator Instructions
Given user opens calclator application
Then Instruction text should be "INSTRCTIONS ARE AS FOLLOWS "

Scenario: read calculator Instructions
Given user opens calclator application
Then Instruction text should be
"""
INSTRCTIONS ARE AS FOLLOWS
1-INSTRUCTION 1
2-INSTRUCTION 2

"""
