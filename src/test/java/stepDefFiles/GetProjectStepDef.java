package stepDefFiles;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetProjectStepDef {
	
	String proId;
	Response res;
	
	@Given("store a projectId {string}")
	public void store_a_project_id(String projectId) {
	   
		proId=projectId;
	}

	@When("By using projectId get the project using get method with endPoint")
	public void by_using_project_id_get_the_project_using_get_method_with_end_point() {
		
	    res=given().when().get("http://localhost:8084/projects/"+proId);
	}

	@Then("verify the response using status code snippet")
	public void verify_the_response_using_status_code_snippet() {
		
		res.then().assertThat().statusCode(200);
	    
	}

	@Then("print all the logs")
	public void print_all_the_logs() {
	    res.then().log().all();
	}

}
