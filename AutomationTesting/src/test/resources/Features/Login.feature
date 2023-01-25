@tag
Feature: Verification of Login page functionality



	@tag1
  Scenario: To validate if the user has not entered any credentials.
    Given User is on Login page
    And User Clicks on login button
    Then Invalid request message should appear
    
  @tag2
  Scenario Outline: To validate if user has entered only username
  	Given User is on Login page 
    And User enters only username with <"<username>"> 	
    And User Clicks on login button
    Then Invalid request message should appear
    
    Examples:
    	|username|
    	|bhushanbsh@gmail.com|	
 
  @tag3
  Scenario Outline: To validate if user has entered only password
  	Given User is on Login page
    And User enters only password with <"<password>">
    And User Clicks on login button
    Then Invalid request message should appear
 
    Examples: 
      |password|   
      |Bhushan@123| 
 
  @tag4
  Scenario Outline: To validate if the user has entered the valid credentials and redirection happens to the home page.
    Given User is on Login page
    And User enters username with <"<username>"> 	
    And User enters password with <"<password>">
    And User Clicks on login button
    Then User is logged in
 
    Examples: 
      |username|password|   
      |bhushanbsh@gmail.com|Bhushan@123|  
      
      
      @tag5
  Scenario Outline: To validate if the user has entered the valid credentials and redirection happens to the home page.
    Given User is on Login page
    And User enters username with <"<username>"> 	
    And User enters password with <"<password>">
    And User Clicks on login button
    Then User is logged in
    Then User clicks on logout
 
    Examples: 
      |username|password|   
      |bhushanbsh@gmail.com|Bhushan@123|
  
      
  
	

