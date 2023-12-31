package upskill.api.restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class PetstoreRestAssuredActions {
	
	//Changes for git
	
	public void createPet(){
		given().
			body(new File(System.getProperty("user.dir")
					+"/src/test/resource/ApiRequestPayloads/CreatePetRequest.json")).
		when().
			header("Content-Type", "application/json").
			header("Username", "sadique").
			header("password", "123").
			post("https://petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir")
					+"/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));
	}
	
	public void getPet(){
		given().
		when().
			header("Content-Type", "application/json").
			header("Username", "sadique").
			header("password", "123").
			get("https://petstore.swagger.io/v2/pet/111").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir")
					+"/src/test/resource/ApiResponseSchemas/GetPetResponse.json")));
	
	}
	
	public void updatePet(){
		given().
			body(new File(System.getProperty("user.dir")
					+"/src/test/resource/ApiRequestPayloads/UpdatePetRequest.json")).
		when().
			header("Content-Type", "application/json").
			header("Username", "sadique").
			header("password", "123").
			put("https://petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir")
					+"/src/test/resource/ApiResponseSchemas/UpdatePetResponse.json")));	
	}

	public void deletePet(){
		given().
		when().
			header("Content-Type", "application/json").
			header("Username", "sadique").
			header("password", "123").
			delete("https://petstore.swagger.io/v2/pet/111").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir")
					+"/src/test/resource/ApiResponseSchemas/DeletePetResponse.json")));
	}
	
}
