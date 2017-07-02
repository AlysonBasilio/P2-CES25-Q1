#Author: your.email@your.domain.com
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
@PesquisaItem
Feature: Pesquisa de um Item no Site

@tag1
Scenario: Cliente procura por um item utilizando uma palavra-chave.
Given a sort of books
			| name    					| description | qtd | value |
			| A Casa  					| terror 			| 2		| 10.0  |
			| A Torre 					| drama 			| 3 	| 20.0  |
			| A Casa na Colina 	| comedia 		| 2 	| 30.0  |
			| A Cabana					| terror 			| 4 	| 25.0  |
When a costumer searches for a book with Casa at it name
Then 2 books must return as a result
	And book1 must have the name A Casa
	And book2 must have the name A Casa na Colina

