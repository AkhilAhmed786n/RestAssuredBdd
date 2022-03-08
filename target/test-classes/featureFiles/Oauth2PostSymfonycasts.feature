Feature: Post using Oauth2 in symfonycast website

Scenario: Getting the eggcount from symfonycast using Oauth2
    Given Store all the fields needed from symfonycast
    When Using fields post a request using endpoint "/token"
    Then From response Get the token using jsonPath
    And Pass the token in Oauth in reqSpecification
    Then Store the User_Id using Pathparam
    And Post a request using given URI with endpoint 
    And verify the response with status code and log all data.