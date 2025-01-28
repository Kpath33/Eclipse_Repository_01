package Automation;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class verify01 {
    @Test
    public void test01() {
        RestAssured.baseURI = "https://reqres.in/api/users";

        RestAssured.given().queryParam("page", "2").when().get().then().statusCode(200);
    }


}
