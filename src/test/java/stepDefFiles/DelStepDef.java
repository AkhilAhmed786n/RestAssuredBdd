package stepDefFiles;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class DelStepDef {
	
	RequestSpecification reqspec;
	Response res;
	
	@Given("Go up with the rest Api and store reqspec")
	public void go_up_with_the_rest_api_and_store_reqspec() {
	    
		reqspec=given().contentType(ContentType.JSON);
	}

	@When("perform Delete method using ProjId {string}")
	public void perform_delete_method_using_proj_id(String projectId) {
	    
		res=reqspec.when().delete("http://localhost:8084/projects"+projectId);
	}

	@Then("Assert the delete status code and log all")
	public void assert_the_delete_status_code_and_log_all() {
	    
		res.then().assertThat().statusCode(204).log().all();
	}

}
