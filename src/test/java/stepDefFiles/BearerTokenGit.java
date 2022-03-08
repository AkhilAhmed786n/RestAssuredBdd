package stepDefFiles;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BearerTokenGit {
	
	RequestSpecification reqspec;
	Response res;
	
	
	@Given("Go with rest Api and save token {string}")
	public void go_with_rest_api_and_save_token(String token) {
	    reqspec=given().auth().oauth2(token);
	    
	}

	@When("sending the get request with endpoint {string}")
	public void sending_the_get_request_with_endpoint(String endpoint) {
		res=reqspec.when().get("https://api.github.com"+endpoint);
	    
	}

	@Then("Asserting response with status code")
	public void asserting_response_with_status_code() {
	    res.then().assertThat().statusCode(200);
	}

	@Then("log all data")
	public void log_all_data() {
	    res.then().log().all();
	}

}
