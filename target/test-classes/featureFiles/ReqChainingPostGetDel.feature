Feature: Request Chaining with post get and delete methods


Scenario Outline: Creating records with different data and get a single data and delete it
		
		
		Given Go with rest API and create body with "<createdBy>" "<projectName>" "<status>" <teamSize>
		When   create a project using Post method and store response
		Then verifyt the statusCode and print logs
		Then get the projectId of the response
		And get the project from projectId
		And Assert the status code and log all
		Then Delete the project from ProjectId
		And Assert the Del status code and log all
		
			
		
		
		
		Examples:
		| createdBy | projectName | status | teamSize |
		| ReqChainPGD22 | ReqChainPGD22 | Completed | 5 |
		| ReqChainPGD23 | ReqChainPGD23 | Completed | 6 |
		| ReqChainPGD24 | ReqChainPGD24 | Completed | 7 |