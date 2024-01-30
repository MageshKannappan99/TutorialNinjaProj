Feature: User Registration

  Scenario: Successful User Registration
    Given the user is on the registration page
    When the user fills in the registration form with valid mandatory information
      | First Name       | Magesh                |
      | Last Name        | Khan                  |
      | E-Mail           | invalidmail@asd.com 	 |
      | Telephone        |  1234567890			 		 |
      | Password         | HU6r4th3aPHaQ@        |
      | Password Confirm | HU6r4th3aPHaQ@        |
    And click the privacy policy check box
    And clicks the continue button
    Then the user should see a confirmation message

  Scenario: Unsuccessful User Registration (Invalid Data)
    Given the user is on the registration page
    When the user fills in the registration form with invalid mandatory information
    	| First Name       | Invalid                	|
      | Last Name        | Khan                  		|
      | E-Mail           | Invalidundewpaf.com 		|
      | Telephone        | 0000000000								|
      | Password         | invalidpassword					|
      | Password Confirm | invalidpassword       		|
    And click the privacy policy check box
    And clicks the continue button
    Then the user should see an invalid error message
