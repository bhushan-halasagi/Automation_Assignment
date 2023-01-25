@register
Feature: User want to order a product

Scenario Outline: User want to register
Given User is on Register page
    And User enters Username with the <"<username>"> 	
    And User enters Password with the <"<password>">
    And User Clicks on Register button
    Then User is Registered
		
Examples:
|username|password|
|bhushanhalasagi@gmail.com|Bhushan@123|
|bhushan@gmail.com|Bhushan@789|