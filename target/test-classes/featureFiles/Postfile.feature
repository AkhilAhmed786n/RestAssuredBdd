Feature: Post method

@Post
Scenario: create a project in rmgyantra using post method
   
    Given set the header and body to create
    When create a project using post method with endpoint "/addProject"
    Then verify the response using status code
    And get the Id of the created project
    Then verify the project is created using Id in get method

