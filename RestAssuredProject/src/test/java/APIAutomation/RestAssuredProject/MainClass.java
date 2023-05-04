package APIAutomation.RestAssuredProject;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		String URI = "http://localhost:3000/POJO";
		String JsonFileURI = "http://localhost:3000/JSONFILE";
		HttpsMethodsUsingJsonFile httpMethods = new HttpsMethodsUsingJsonFile();
		PostRequestsUsingPOJO pojo = new PostRequestsUsingPOJO();
		pojo.complexJson(URI);
		
	/*	JsonParser jsonParser = new JsonParser();
		jsonParser.parseSingleKey(JsonFileURI);
		jsonParser.parseMultipleKeys(URI);
		jsonParser.parseAllKeysAndValues(URI);*/
		/*pojo.simpleJson(URI);
		pojo.complexJson(URI);*/
		//pojo.arrayJsonUsingPojo(URI);
		/*
		 * HttpsMethodsUsingJsonFile httpmethods = new HttpsMethodsUsingJsonFile();
		 * httpmethods.postRequest(URI); PostRequestWithBodyDataUsingOrgJson org = new
		 * PostRequestWithBodyDataUsingOrgJson(); org.simpleJSON(URI);
		 * org.complexJSON(URI); org.arrayJSON(URI); SimpleJSONUsingPOJO simple = new
		 * SimpleJSONUsingPOJO(); ComplexJSONUsingPOJO addressType = new
		 * ComplexJSONUsingPOJO(); simple.setFirstName("SUSHIL");
		 * simple.setLastName("AGRAWAL"); simple.setMobile("9045625465");
		 * simple.setAddress("B13 Dharam Colony"); simple.setAddresstype(addressType);
		 * addressType.setArea("Udyog Vihar"); addressType.setSector("Sector 12");
		 * 
		 * Response res =
		 * given().contentType(ContentType.JSON).body(simple).when().post(URI);
		 * System.out.
		 * println("********************Simple Json Using POJO********************");
		 * System.out.println("The Status code of the Simple Json is ="+
		 * res.statusCode()); httpMethods.getRequest(URI);
		 */
	}

}
