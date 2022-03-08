Feature: Get Request Using Bearer Token

@BearerToken
Scenario: Getting the repos from Git using bearer token auth
    Given Go with rest Api and save token "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"
    When sending the get request with endpoint "/repositories"
    Then Asserting response with status code
    And log all data