#Author: alyson.basilio@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@BooksThatIWantToBuy
Feature: Books that I want to buy

@tag1
Scenario: Costumer adds book to your list
Given a book named A Casa with description terror qtd 2	and value 10.0
And a costumer named Alyson, a Non-Sailing Gift Buyer
When this costumer decided to put this livro in his list
Then 1 books must return as a result to this costumer's list
	And book3 must have the name A Casa