package Selenium03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.goibibo.com/flights/air-DEL-MAA-20241231--1-0-0-E-D?");
			driver.manage().window().maximize();
			 // Wait for the page to load and the elements to be present
	        try {
	            Thread.sleep(1000); // Adjust the sleep time as needed
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Locate all elements with the common XPath
	        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@name='SRP_Actual_Fare']"));

	        // Print the text of each price element
	        for (WebElement priceElement : priceElements) {
	            System.out.println("Price: " + priceElement.getText());
	        }

	        driver.quit();
	}

}
