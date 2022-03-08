Feature: Delete method

Scenario Outline: scenario description
		Given Go up with the rest Api and store reqspec
		When perform Delete method using ProjId "projectId"
		Then Assert the delete status code and log all
		
		Examples:
		| projectId |
		| TY_PROJ_2208 |
		| TY_PROJ_2209 |
		| TY_PROJ_2210 |
		| TY_PROJ_2211 |
		| TY_PROJ_2212 |