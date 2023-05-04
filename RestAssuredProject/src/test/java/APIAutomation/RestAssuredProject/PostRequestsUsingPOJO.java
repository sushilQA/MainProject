package APIAutomation.RestAssuredProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRequestsUsingPOJO {

	HttpsMethodsUsingJsonFile httpMethods = new HttpsMethodsUsingJsonFile();
	//URI = "http://localhost:3000/POJO";
	public void simpleJson(String URI) throws FileNotFoundException {
		SimpleJSONUsingPOJO simple = new SimpleJSONUsingPOJO();
		simple.setFirstName("SUSHIL");
		simple.setLastName("AGRAWAL");
		simple.setMobile("9045625465");
		simple.setAddress("B13 Dharam Colony");
		Response res = given().contentType(ContentType.JSON).body(simple).when().post(URI);
		System.out.println("********************Simple Json Using POJO********************");
		System.out.println("The Status code of the Simple Json is =" + res.statusCode());
		httpMethods.getRequest(URI);
	}

	public void complexJson(String URI) throws FileNotFoundException {
		SimpleJSONUsingPOJO simple = new SimpleJSONUsingPOJO();
		ComplexJSONUsingPOJO addressType = new ComplexJSONUsingPOJO();
		simple.setFirstName("SUSHIL");
		simple.setLastName("AGRAWAL");
		simple.setMobile("9045625465");
		simple.setAddress("B13 Dharam Colony");
		simple.setAddresstype(addressType);
		addressType.setArea("Udyog Vihar");
		addressType.setSector("Sector 12");
		Response res = given().contentType(ContentType.JSON).body(simple).when().post(URI);
		System.out.println("********************Complex Json Using POJO********************");
		System.out.println("The Status code of the Complex Json is =" + res.statusCode());
		httpMethods.getRequest(URI);

	}
	
	public void arrayJsonUsingPojo(String URI) throws FileNotFoundException {
		
		ArrayJSONUsingPOJO[] arrayJSONUsingPOJO = new ArrayJSONUsingPOJO[2];
		arrayJSONUsingPOJO[0] = new ArrayJSONUsingPOJO();
		arrayJSONUsingPOJO[0].setLandmark("B13,Manoj Gupta");
		arrayJSONUsingPOJO[0].setStreet("Street No 9");
		arrayJSONUsingPOJO[0].setWardNo("102");
		arrayJSONUsingPOJO[1] = new ArrayJSONUsingPOJO();
		arrayJSONUsingPOJO[1].setLandmark("B14,Manoj Gupta");
		arrayJSONUsingPOJO[1].setStreet("Street No 9");
		arrayJSONUsingPOJO[1].setWardNo("103");	
		SimpleJSONUsingPOJO simple = new SimpleJSONUsingPOJO();
		simple.setFirstName("SUSHIL");
		simple.setLastName("AGRAWAL");
		simple.setMobile("9045625465");
		simple.setAddress("B13 Dharam Colony");
		simple.setArrayJSONUsingPOJO(arrayJSONUsingPOJO);
		Response res = given().contentType(ContentType.JSON).body(simple).when().post(URI);
		System.out.println("********************Simple Json Using POJO********************");
		System.out.println("The Status code of the Simple Json is =" + res.statusCode());
		httpMethods.getRequest(URI);
	}

}
