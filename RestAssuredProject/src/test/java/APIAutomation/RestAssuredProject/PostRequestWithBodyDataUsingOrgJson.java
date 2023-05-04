package APIAutomation.RestAssuredProject;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;

public class PostRequestWithBodyDataUsingOrgJson {

	JSONObject jsonObject = new JSONObject();
	JSONObject innerJsonObject1 = new JSONObject();
	JSONObject innerJsonObject2 = new JSONObject();
	JSONArray innerJsonArray = new JSONArray();
	HttpsMethodsUsingJsonFile httpMethods = new HttpsMethodsUsingJsonFile();

	public void simpleJSON(String URI) throws FileNotFoundException {
		System.out.println("********************Simple JSON USING OrgJson********************");
		jsonObject.put("FirstName", "SUSHIL");
		jsonObject.put("LastName", "KUMAR");
		jsonObject.put("MobileNo", "9045625465");
		jsonObject.put("EmailAddress", "SUSHIL.AGRAWAL89@GMAIL.COM");
		jsonObject.put("Gender", "MALE");
		Response res = given().contentType(ContentType.JSON).body(jsonObject.toString()).when().post(URI);
		System.out.println("Status Code is =" + res.statusCode());
		httpMethods.getRequest(URI);
	}

	public void complexJSON(String URI) throws FileNotFoundException {
		System.out.println("********************Complex JSON USING OrgJson********************");
		jsonObject.put("FirstName", "SUSHIL");
		jsonObject.put("LastName", "KUMAR");
		jsonObject.put("MobileNo", "9045625465");
		jsonObject.put("EmailAddress", "SUSHIL.AGRAWAL89@GMAIL.COM");
		jsonObject.put("Gender", "MALE");
		jsonObject.put("Address", innerJsonObject1);
		innerJsonObject1.put("Sector", "Sector 12");
		innerJsonObject1.put("Area", "Dharam Colony,Palam Vihar Extension");
		innerJsonObject1.put("State", "Haryana Gurgaon 122017");
		Response res = given().contentType(ContentType.JSON).body(jsonObject.toString()).when().post(URI);
		System.out.println("Status Code is =" + res.statusCode());
		httpMethods.getRequest(URI);
	}

	public void arrayJSON(String URI) throws FileNotFoundException {
		System.out.println("********************Array JSON USING OrgJson********************");
		jsonObject.put("FirstName", "SUSHIL");
		jsonObject.put("LastName", "KUMAR");
		jsonObject.put("MobileNo", "9045625465");
		jsonObject.put("EmailAddress", "SUSHIL.AGRAWAL89@GMAIL.COM");
		jsonObject.put("Gender", "MALE");
		jsonObject.put("Address", innerJsonArray);
		innerJsonArray.put(0, innerJsonObject1);
		innerJsonArray.put(1, innerJsonObject2);
		innerJsonObject1.put("PrimaryAddress", "Home Address");
		innerJsonObject1.put("Sector", "Sector 12");
		innerJsonObject1.put("Area", "Dharam Colony,Palam Vihar Extension");
		innerJsonObject1.put("State", "Haryana Gurgaon 122017");
		innerJsonObject2.put("SecondryAddress", "Office Address");
		innerJsonObject2.put("Sector", "Sector 10");
		innerJsonObject2.put("Area", "Udyog Vihar Phase IV");
		innerJsonObject2.put("State", "Haryana Gurgaon 122001");
		Response res = given().contentType(ContentType.JSON).body(jsonObject.toString()).when().post(URI);
		System.out.println("Status Code is =" + res.statusCode());
		httpMethods.getRequest(URI);
	}

}
