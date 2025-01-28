package Automation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequest {
    @Test
    public void test01() {
    JSONObject request = new JSONObject();
    request.put("name", "raja");
    request.put("job", "testlead");
    RestAssured.baseURI = "https://reqres.in/api/users";
    RestAssured.given().header("Content-Type", "application/json").body(request.toJSONString()).when().post().then().statusCode(201);
   
    }

}
