Feature: login functionality

  #@smoke
  #Scenario: verify the login functionality
  #Given we have a URL and launch the browser
  #When user enter the valid username and password
  #And click on the login button
  #Then validate the user to navigate to the home page
  
  @smoke
  Scenario Outline: verify the login functionality
    #Given we have a URL and launch the browser
    When user enter the valid "<username>" and "<password>"
    And click on the login button
    Then validate the user to navigate to the home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | Demo2         | test2        |
