package APIAutomation.RestAssuredProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.json.JSONObject;
import org.json.JSONTokener;

public class HttpsMethodsUsingJsonFile {

	Scanner scanner = new Scanner(System.in);

	public void postRequest(String URI) throws FileNotFoundException {
		File file = new File("../RestAssuredProject/dummy.json");
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject jsonObject = new JSONObject(jsonTokener);
		// System.out.println(jsonObject);
		Response res = given().contentType(ContentType.JSON).body(jsonObject.toString()).post(URI);
		System.out.println("Status of the POST Request is =" + res.statusCode());
		System.out.println("Data after POST Request");
		getRequest(URI);
	}

	public void getRequest(String URI) throws FileNotFoundException {
		File file = new File("../RestAssuredProject/dummy.json");
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject jsonObject = new JSONObject(jsonTokener);
		// System.out.println(jsonObject);
		Response res = given().contentType(ContentType.JSON).body(jsonObject.toString()).get(URI);
		System.out.println(res.asPrettyString());
		System.out.println("And the Status of the GET Request is =" + res.statusCode());
	}

	public void deleteRequest(String URI) throws FileNotFoundException {
		File file = new File("../RestAssuredProject/dummy.json");
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject jsonObject = new JSONObject(jsonTokener);
		System.out.println("Enter the ID of the resource which you want to delete");
		String resourceID = scanner.next();
		Response res = given().contentType(ContentType.JSON).body(jsonObject.toString()).delete(URI + "/" + resourceID);
		System.out.println("Status of the DELETE Request is =" + res.statusCode());
		System.out.println("Data of the file after deleting the " + resourceID + " resource id");
		getRequest(URI);

	}

}
