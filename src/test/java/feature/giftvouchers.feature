Feature: Elearning login page

  Background: Background selection
    Given User is on homepage

  Scenario Outline: Login with unauthorized user
    When user enter invalid Username "<username>" and password "<password>"
    When user click on Submit button
    When user enter valid credentials and code "<code>"
    When user click on submit button
    When User enter valid Credentials
    When User click on submit button

    Examples: 
      | username | password  |code|
      | admin    | Admin@123 |2334|
                                               
