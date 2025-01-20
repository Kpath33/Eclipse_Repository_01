package Selenium01;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		List<WebElement> abc = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement x : abc) {
			x.click();
		}
	}

}
