Feature: Using Get Method

@Get
Scenario: Using get method getting a existing project
    Given store a projectId "TY_PROJ_1816" 
    When By using projectId get the project using get method with endPoint
    Then verify the response using status code snippet
    And print all the logs