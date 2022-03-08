Feature: Post, Get and Delete Methods in single feature

Scenario: Post method using HashMap
    Given Go up with rest API with hashMap body
    When create a project using ending "/addProject" and store res
    Then assert the post response with status code and log all 
    
    
Scenario: Get Method using projectId
    Given Go up with rest API
    When an action is performed
    Then something should be asserted   
    
    
Scenario: Post method using JSONObject
    Given a precondition is valid
    When an action is performed
    Then something should be asserted     
    
    
    
Scenario: Post method using pojoclass
    Given a precondition is valid
    When an action is performed
    Then something should be asserted    
    
    
 Scenario: get method using projectId
     Given a precondition is valid
     When an action is performed
     Then something should be asserted   
     
     
     
 Scenario: Delete method using ProjectId
     Given a precondition is valid
     When an action is performed
     Then something should be asserted    