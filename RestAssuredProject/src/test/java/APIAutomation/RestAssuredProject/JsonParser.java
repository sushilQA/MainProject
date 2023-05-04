package APIAutomation.RestAssuredProject;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonParser {

	// URI = "http://localhost:3000/JSONFILE"

	HttpsMethodsUsingJsonFile httpMethods = new HttpsMethodsUsingJsonFile();

	public void parseSingleKey(String URI) throws FileNotFoundException {
		File file = new File("../RestAssuredProject/dummy.json");
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject jsonObject = new JSONObject(jsonTokener);
		System.out.println("\n******************** The code for parsing a SingleKey ********************\n");
		Response response = given().contentType(ContentType.JSON).body(jsonObject.toString()).get(URI);
		System.out.println("\n******************** Before parsing the JSON is ********************\n");
		System.out.println(response.asPrettyString());
		JSONArray jsonArray1 = new JSONArray(response.asPrettyString());
		JSONObject jsonObject2 = jsonArray1.getJSONObject(0);
		System.out.println("After Parsing the JSON the EmailAddress is \n\n" + jsonObject2.get("EmailAddress"));

	}

	public void parseMultipleKeys(String URI) throws FileNotFoundException {
		File file = new File("../RestAssuredProject/dummy.json");
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject jsonObject = new JSONObject(jsonTokener);
		System.out.println("\n******************** The code for parsing Multiple Keys ********************\n");
		Response response = given().contentType(ContentType.JSON).body(jsonObject.toString()).get(URI);
		System.out.println("\n******************** Before parsing the JSON ********************\n");
		System.out.println(response.asPrettyString());
		JSONArray jsonArray1 = new JSONArray(response.asPrettyString());
		int length = jsonArray1.length();
		System.out.println("\n After Parsing the JSON the Ids are");
		for (int i = 0; i < length; i++) {
			JSONObject jsonObject2 = jsonArray1.getJSONObject(i);
			System.out.println(jsonObject2.get("id"));
		}

	}

	public void parseAllKeysAndValues(String URI) throws FileNotFoundException {
		File file = new File("../RestAssuredProject/dummy.json");
		FileReader fileReader = new FileReader(file);
		JSONTokener jsonTokener = new JSONTokener(fileReader);
		JSONObject jsonObject = new JSONObject(jsonTokener);
		System.out.println("\n******************** The code for parsing All Keys and Values ********************\n");
		Response response = given().contentType(ContentType.JSON).body(jsonObject.toString()).get(URI);
		System.out.println("\n******************** Before parsing the JSON ********************\n");
		System.out.println(response.asPrettyString());
		JSONArray jsonArray1 = new JSONArray(response.asPrettyString());
		int length = jsonArray1.length();
		System.out.println("\nAfter Parsing the JSON " + "\n");
		for (int i = 0; i < length; i++) {
			JSONObject jsonObject2 = jsonArray1.getJSONObject(i);
			System.out.println("The data for id " + jsonObject2.get("id") + " are given below :\n");
			Set<String> allKeys = jsonObject2.keySet();
			for (String string : allKeys) {
				System.out.println("The Key is = " + string + " and the Value is = " + jsonObject2.get(string));
			}
			System.out.println("\n");
		}

	}

}
