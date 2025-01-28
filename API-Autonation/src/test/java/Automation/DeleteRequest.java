package Automation; // Declares the package name for this class

import org.testng.annotations.Test; // Imports the Test annotation from TestNG

import io.restassured.RestAssured; // Imports the RestAssured class from the RestAssured library

public class DeleteRequest { // Declares a public class named DeleteRequest
    @Test // Marks the following method as a test method
    public void test01() { // Declares a public method named test01
        RestAssured.baseURI = "https://reqres.in/api/users"; // Sets the base URI for RestAssured requests
        io.restassured.response.Response response = RestAssured.given().queryParam("page", "2").when().delete(); 
        // Sends a DELETE request to the specified endpoint with a query parameter 'page' set to '2' and stores the response

        response.then().statusCode(204); // Asserts that the response status code should be 204 (No Content)
        System.out.println("Delete request is successful Status code: " + response.getStatusLine()); 
        // Prints a message to the console indicating the delete request was successful, along with the status line of the response
    } // Closes the test01 method

} // Closes the DeleteRequest class
