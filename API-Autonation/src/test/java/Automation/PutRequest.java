package Automation; // Declares the package name for this class

import org.json.simple.JSONObject; // Imports the JSONObject class from the JSON.simple library
import org.testng.annotations.Test; // Imports the Test annotation from TestNG

import io.restassured.RestAssured; // Imports the RestAssured class from the RestAssured library

public class PutRequest { // Declares a public class named PutRequest

    @Test // Marks the following method as a test method
    public void test01() { // Declares a public method named test01
        JSONObject request = new JSONObject(); // Creates a new JSONObject instance
        request.put("name", "raja"); // Adds a key-value pair to the JSON object with key "name" and value "raja"
        request.put("job", "testlead"); // Adds a key-value pair to the JSON object with key "job" and value "testlead"

        RestAssured.baseURI = "https://reqres.in/api/users"; // Sets the base URI for RestAssured requests
        RestAssured.given() // Starts building the request
            .header("Content-Type", "application/json; charset=utf-8") // Adds a header to the request specifying the content type as JSON with UTF-8 charset
            .body(request.toJSONString()) // Adds the JSON object as the body of the request
            .when().put() // Sends a PUT request to the specified endpoint
            .then().statusCode(200); // Asserts that the response status code should be 200 (OK)
    } // Closes the test01 method

} // Closes the PutRequest class
