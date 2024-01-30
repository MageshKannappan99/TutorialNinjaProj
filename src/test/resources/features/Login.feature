
Feature: User Login

  Background: 
    Given the user is on the login page

  Scenario Outline: Successful Login
    When the user enters valid "<username>" and "<password>"
    And clicks the Login button
    Then the user should be redirected to the Homepage

    Examples: 
      | username              | password       |
      | mopoj20050@undewp.com | HU6r4th3aPHaQ@ |

  Scenario: Unsuccessful Login (Invalid Credentials)
    When the user enters an invalid username "mopoj20050@undewpasd.com" and password "HU6r4th3aPHaQ@sadf"
    And clicks the Login button
    Then the user should see an error message

  Scenario: Unsuccessful Login (Empty Fields)
    When the user leaves the username and password fields empty
    And clicks the Login button
    Then the user should see a message indicating that fields are required
@smoke
  Scenario: Password Reset
    When the user clicks the Forgot Password link
    Then the user should be redirected to the password reset page
    And the user should see a form for resetting the password
