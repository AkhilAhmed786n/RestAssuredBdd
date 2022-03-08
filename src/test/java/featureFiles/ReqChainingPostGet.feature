Feature: Request Chaining with Post and Get methods
Scenario: ReqChaining by creating a project and passing its Id in another request
    Given Go up with rest Api and create body
    When perform Post action and store response1
    Then verify the status code and log data
    Then get the ProjectId of the above response1
    And Pass the projectId in Get request and store response2
    And Verify the status code and log data of response2