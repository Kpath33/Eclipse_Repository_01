package Automation;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class verifyget {
  @Test
  public void test01() {
    Response response = get("https://reqres.in/api/users?page=2");
   System.out.println("this is status code "+ response.statusCode());
   System.out.println("this is status line: "+response.getStatusLine());
   System.out.println("this is time: "+response.getTime());



  }
}
