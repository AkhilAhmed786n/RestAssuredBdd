package reqChainingStepDef;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilityPack.JavaUtility;
import utilityPack.PojoClass;

import static io.restassured.RestAssured.*;

public class ReqChainingPGD {
	
	RequestSpecification reqspec1;
	Response res1,res2, res3;
	String projId;
	
	JavaUtility ju=new JavaUtility();
	
	@Given("Go with rest API and create body with {string} {string} {string} {int}")
	public void go_with_rest_api_and_create_body_with(String createdBy, String projectName, String status, Integer teamSize) {
	    
		PojoClass pj=new PojoClass(createdBy+ju.generateRandomNum(), projectName+ju.generateRandomNum(), status,teamSize );
		
		reqspec1=given().contentType(ContentType.JSON).body(pj);
		
	}

	@When("create a project using Post method and store response")
	public void create_a_project_using_post_method_and_store_response() {
	    
		res1=reqspec1.when().post("http://localhost:8084/addProject");
	}
	
	@Then("verifyt the statusCode and print logs")
	public void verifyt_the_status_code_and_print_logs() {
	 		
		res1.then().assertThat().statusCode(201).log().all();
		
	}

	@Then("get the projectId of the response")
	public void get_the_project_id_of_the_response() {
	    
		projId=res1.jsonPath().getString("projectId");
	}
	
	@Then("get the project from projectId")
	public void get_the_project_from_project_id() {
	    
		res2=given().when().get("http://localhost:8084/projects/"+projId);
	}

	@Then("Assert the status code and log all")
	public void assert_the_status_code_and_log_all() {
		
		res2.then().assertThat().statusCode(200).log().all();
	    
	}
	
	@Then("Delete the project from ProjectId")
	public void delete_the_project_from_project_id() {
	   res3= given().when().delete("http://localhost:8084/projects/"+projId);
	}

	@Then("Assert the Del status code and log all")
	public void assert_the_del_status_code_and_log_all() {
		
		res3.then().assertThat().statusCode(204).log().all();
	}

}
