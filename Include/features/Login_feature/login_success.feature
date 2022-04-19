Feature: Verify login functionality swaglabs

  Scenario Outline: User should be able to login using valid credentials
    Given user has been navigated into the login page
    When user click on username field and input the <username>
    And click on password field and input the <password>
    And click on Login button
    Then user will navigates into the home dashboard page

    Examples: 
      | username                | password                 |
      | standard_user           | qcu24s4901FyWDTwXGr6XA== |
      | problem_user            | qcu24s4901FyWDTwXGr6XA== |
      | performance_glitch_user | qcu24s4901FyWDTwXGr6XA== |
