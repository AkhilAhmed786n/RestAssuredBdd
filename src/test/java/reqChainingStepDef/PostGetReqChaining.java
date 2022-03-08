package reqChainingStepDef;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

public class PostGetReqChaining {
	
	RequestSpecification reqspec1;
	Response res1,res2;
	String projId;
	
	
	
	@Given("Go up with rest Api and create body")
	public void go_up_with_rest_api_and_create_body() {
	    
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "ReqChainPG1");
		jobj.put("projectName", "reqChainPG1");
		jobj.put("status", "Completed");
		jobj.put("teamSize", 6);
		
		reqspec1=given().contentType(ContentType.JSON).body(jobj);
		
	}

	@When("perform Post action and store response1")
	public void perform_post_action_and_store_response1() {
		
		res1=reqspec1.when().post("http://localhost:8084/addProject");
	    
	}

	@Then("verify the status code and log data")
	public void verify_the_status_code_and_log_data() {
	    res1.then().assertThat().statusCode(201).log().all();
	}

	@Then("get the ProjectId of the above response1")
	public void get_the_project_id_of_the_above_response1() {
	    
		projId=res1.jsonPath().getString("projectId");
	}

	@Then("Pass the projectId in Get request and store response2")
	public void pass_the_project_id_in_get_request_and_store_response2() {
	    
		res2=given().when().get("http://localhost:8084/projects/"+projId);
	}

	@Then("Verify the status code and log data of response2")
	public void verify_the_status_code_and_log_data_of_response2() {
	    
		res2.then().assertThat().statusCode(200).log().all();
	}

}
