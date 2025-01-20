package Selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='top']")).click();
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.name("This element is in iframe - name attribute is not available for this element")).sendKeys("hello");
		
		

	}

}
