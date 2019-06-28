Feature: Calculation feature

Background:
Given i have an calculator

Scenario: Addition functionality of calculator
When I have addition of 5 and 7
Then Result will be 12 
 
Scenario: subtraction functionality of calculator

When I have subtraction of 7 and 5
Then Result will be 2 

Scenario: multiplication functionality of calculator

When I have multiplication of 7 and 5
Then Result will be 35 

Scenario Outline: Addition
When I have addition of <input_1> and <input_2>
Then Result will be <result>
Examples:
|input_1|input_2|result|
|  5    | 9     |14    |
|  10   |20     |30    | 

Scenario Outline: subtraction
When I have subtraction of <input_1> and <input_2>
Then Result will be <result>
Examples:
|input_1|input_2|result|
|  8    | 4     |  4   |
|  20   |10     |10    |

#List of numbers
Scenario: Addition of list
When user adds:
|8|
|10|
|2|
|4|
Then Result will be 24


 