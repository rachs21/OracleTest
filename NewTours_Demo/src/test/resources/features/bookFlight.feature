@BookFlight
Feature: To Test Ticket Booking for New Tours Company
   As an user of the New Tours 
   I want to book Flight Tickets 
   In order to Test Ticket Booking feature for New Tours Company
   
   Background: Successful Login  
	Given I navigate to the home page
	When I submit username and password
	| userName   | password |
	|  mercury   | mercury   |
	Then I should be logged in  
     
       
     
   Scenario Outline: Successful Flight Booking 
     When I select number of passengers "<Passengers>"
     And I select Departing From as "<DepartPort>" 
     And I select Departure Month "<DepartMonth>" and Day as "<DepartDay>" 
     And I select Arriving In as "<ArrivalPort>" 
     And I select Arrival Month "<ArrivalMonth>" and Day as "<ArrivalDay>" 
     Then I click on the find Flights Continue button
     Then I click on the reserve Flights Continue button
     And I enter FirstName as "<FirstName>" and LastName as "<LastName>" 
     And I enter Card Number as "<CardNum>"
     And I click on the Secure Purchase button
     Then I should see Flight confirmation page
     Examples:
   		  | Passengers	| DepartPort| DepartMonth |DepartDay 	| ArrivalPort 	| ArrivalMonth	| ArrivalDay | FirstName| LastName 	| CardNum 	|
   		  | 1 			| London 	| April 	  | 20          | Paris     	| April 		| 30 		 | Customer	| One		| 1000 		|
   		  | 1 			| Zurich 	| May		  | 20 			| Portland 		| May 			| 30 		 | Customer | Two 		| 1001 		|
