package postStepDef;

import java.util.HashMap;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class PostStepDef {

	RequestSpecification reqspec;
	HashMap hm;
	Response res;
	String Id;

	
	@Given("set the header and body to create")
	public void set_the_header_and_body_to_create() {

		HashMap hm = new HashMap();

		hm.put("createdBy", "HashmapBDD2");
		hm.put("projectName", "hashmapBDD2");
		hm.put("status", "Completed");
		hm.put("teamSize", 7);

		reqspec = given().contentType(ContentType.JSON).body(hm);

	}

	@When("create a project using post method with endpoint {string}")
	public void create_a_project_using_post_method_with_endpoint(String create) {

		res = reqspec.when().post("http://localhost:8084" + create);

	}

	@Then("verify the response using status code")
	public void verify_the_response_using_status_code() {

		res.then().assertThat().statusCode(201);
	}

	@Then("get the Id of the created project")
	public void get_the_id_of_the_created_project() {

		Id = res.jsonPath().getString("projectId");
	}

	@Then("verify the project is created using Id in get method")
	public void verify_the_project_is_created_using_id_in_get_method() {

		when().get("http://localhost:8084/projects/" + Id).then().assertThat().statusCode(200).log().all();
	}
}
