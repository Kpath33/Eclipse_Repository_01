package Automation; // Declares the package name for this class

import org.testng.annotations.Test; // Imports the Test annotation from TestNG

import io.restassured.RestAssured; // Imports the RestAssured class from the RestAssured library

public class verify01 { // Declares a public class named verify01
    @Test // Marks the following method as a test method
    public void test01() { // Declares a public method named test01
        RestAssured.baseURI = "https://reqres.in/api/users"; // Sets the base URI for RestAssured requests

        RestAssured.given() // Starts building the request
            .queryParam("page", "2") // Adds a query parameter to the request with key "page" and value "2"
            .when().get() // Sends a GET request to the specified endpoint
            .then().statusCode(200); // Asserts that the response status code should be 200 (OK)
    } // Closes the test01 method
} // Closes the verify01 class
