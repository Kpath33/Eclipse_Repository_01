package Selenium01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	/*	
		// scroll by pixel
		js.executeScript("window.scrollBy(0,500)");
	*/
	/*	
		// view the element
		WebElement  abc = driver.findElement(By.xpath("//button[@id='Button1']"));
		js.executeScript("arguments[0].scrollIntoView();", abc);
		*/
		
		// scroll to the bottom of the page
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	}

}
