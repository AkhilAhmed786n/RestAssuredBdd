package postStepDef;
	
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilityPack.PojoClass;

import static io.restassured.RestAssured.*;
	
public class BasicAuthPost {
	
	RequestSpecification reqspec;
	PojoClass  pj=new PojoClass("BasicAkhil", "BasicMahesh", "Completed", 6);;
	Response res;
		
	@Given("Go up with rest api with credentials {string} {string}")
	public void go_up_with_rest_api_with_credentials(String username, String password) {
	    
		reqspec=given().auth().basic(username, password);
	}
	
	@When("Create a project with basic authentication and with endpoint {string}")
	public void create_a_project_with_basic_authentication_and_with_endpoint(String endpoint) {
	   
//		 pj=new PojoClass("BasicAkhil12", "BasicMahesh12", "Completed", 8);
		 
		res= reqspec.contentType(ContentType.JSON).body(pj).when().post("http://localhost:8084"+endpoint);
	}
	
	@Then("verify the post response with status code")
	public void verify_the_post_response_with_status_code(){
		
	   res.then().assertThat().statusCode(201);
	}
	
	@Then("print all logs")
	public void print_all_logs() {
		
	    res.then().log().all();    
	}
		
}	
	