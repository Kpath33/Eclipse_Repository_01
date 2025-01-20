package TestNg02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo01 {
  @Test(dependsOnMethods = "signup")
  public void login() {
	  System.out.println("Login test case");  
  }
  @Test
	public void signup() {
		System.out.println("Signup test case");
		//Assert.assertTrue(false);
	}
  @Test
      public void payment() {
	  System.out.println("Payment test case");
  }
 /* @Test
	public void A() {
		System.out.println("a test case");
	}
  @Test
      public void W() {
	  System.out.println("b test case");
  }

	@Test
	public void q() {
		System.out.println("q test case");
	}*/
}
