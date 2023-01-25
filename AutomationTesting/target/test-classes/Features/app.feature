@app
Feature: I want to order a product

Background: User is Logged In
    Given I navigate to the login page
    When I submit username and password
    Then I should be logged in
    
@app1    
Scenario: I want to order
		Given User is on Homepage
		When User clicks on orders
		And User clicks on go to shop
		Then User navigates to shopping page
		Then User adds a price filter
		Then User clicks on filter
		
@app2
Scenario: I want to change account details
		Given: User is on Homepage
		When User clicks on Account details
		Then User enters First Name with <"<firstName>">
		Then User enters Last Name with <"<lastName>">	
		Then User clicks on Save Changes

Examples:
|firstName|lastName|
|Bhushan|Halasagi|
		
@app3
Scenario Outline: I want to change password
		Given: User is on Homepage
		When User clicks on Account details
		Then User enters First Name with <"<firstName>">
  	Then User enters Last Name with <"<lastName>">	
		Then User enters Old Password with <"<oldPassword>">
		Then User enters New Password with <"<newPassword>">
		Then User enters New Password again with <"<confirmPassword>">
		Then User clicks on Save Changes
		
Examples:
|firstName|lastName|oldPassword|newPassword|confirmPassword|
|Bhushan|Halasagi|Bhushan@123|Bhushan@123|Bhushan@123|
