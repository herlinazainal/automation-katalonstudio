Feature: Verify login functionality swaglabs

  Scenario Outline: User can't be able to login using invalid credentials
    Given user_f has been navigated into the login page
    When user_f click on username field and input the <username>
    And click password field and input the wrong <password>
    And click Login button
    Then user_f will show an error message

    Examples: 
      | username                | password                 |
      | standard_user           | 60y/H6p+xTMwtZz78YE75Q== |
      | problem_user            | 60y/H6p+xTMwtZz78YE75Q== |
      | performance_glitch_user | 60y/H6p+xTMwtZz78YE75Q== |
