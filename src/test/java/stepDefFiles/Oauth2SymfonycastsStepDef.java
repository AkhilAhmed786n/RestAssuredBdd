package stepDefFiles;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Oauth2SymfonycastsStepDef {
	
	RequestSpecification reqres1;
	Response res1;
	String token;
	RequestSpecification reqspec2;
	Response res2;

	@Given("Store all the fields needed from symfonycast")
	public void store_all_the_fields_needed_from_symfonycast() {
	    
		reqres1=given()
		.formParam("client_id", "TYBOauth2")
		.formParam("client_secret", "11df1a4cab8821dbf580bb5ef26b7292")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "https://TYBOauth2.com");
		
	}

	@When("Using fields post a request using endpoint {string}")
	public void using_fields_post_a_request_using_endpoint(String endpoint) {
		
		res1=reqres1.when().post("http://coop.apps.symfonycasts.com"+endpoint);
	    
	}

	@Then("From response Get the token using jsonPath")
	public void from_response_get_the_token_using_json_path() {
	    
		token=res1.jsonPath().getString("access_token");
	}

	@Then("Pass the token in Oauth in reqSpecification")
	public void pass_the_token_in_oauth_in_req_specification() {
	   
		reqspec2=given().auth().oauth2(token);
		
		
	}

	@Then("Store the User_Id using Pathparam")
	public void store_the_user_id_using_pathparam() {
	    reqspec2.pathParam("USER_ID", 2534);
	}

	@Then("Post a request using given URI with endpoint")
	public void post_a_request_using_given_uri_with_endpoint() {
	    res2=reqspec2.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count");
	}

	@Then("verify the response with status code and log all data.")
	public void verify_the_response_with_status_code_and_log_all_data() {
	  
		res2.then().assertThat().statusCode(200).log().all();
	}
	
}
