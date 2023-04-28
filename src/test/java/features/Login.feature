Feature: login functionality

  #@smoke
  #Scenario: verify the login functionality
  #Given we have a URL and launch the browser
  #When user enter the valid username and password
  #And click on the login button
  #Then validate the user to navigate to the home page
  Scenario Outline: verify the login functionality
    #Given we have a URL and launch the browser
    When user enter the valid "<username>" and "<password>"
    And click on the login button
    Then validate the user to navigate to the home page

    Examples: 
      | username | password |
      | Demo1    | test1    |
      | Demo2    | test2    |
      | Demo3    | test3    |
      | Demo4    | test4    |
      | Demo5    | test5    |
      | Demo6    | test6    |
      | Demo7    | test7    |
      | Demo8    | test8    |
