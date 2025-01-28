package Automation; // Declares the package name for this class

import org.testng.annotations.Test; // Imports the Response class from the RestAssured library

import static io.restassured.RestAssured.get; // Imports all static members of the RestAssured class
import io.restassured.response.Response; // Imports the Test annotation from TestNG

public class verifyget { // Declares a public class named verifyget
    @Test // Marks the following method as a test method
    public void test01() { // Declares a public method named test01
        Response response = get("https://reqres.in/api/users?page=2"); // Sends a GET request to the specified endpoint and stores the response

        System.out.println("this is status code " + response.statusCode()); // Prints the status code of the response
        System.out.println("this is status line: " + response.getStatusLine()); // Prints the status line of the response
        System.out.println("this is time: " + response.getTime()); // Prints the time taken for the response
    } // Closes the test01 method
} // Closes the verifyget class
