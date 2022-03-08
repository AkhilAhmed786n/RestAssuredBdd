Feature: Post method using basic-auth Authentication
@Basic
Scenario: create a project with basic credentials

    Given Go up with rest api with credentials "rmgyantra" "rmgy@9999"
    When  Create a project with basic authentication and with endpoint "/addProject"
    Then  verify the post response with status code
    And   print all logs