package Selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo01 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		//driver.findElement(By.xpath("//div[@aria-label='Search by voice']//*[name()='svg']")).click();
		

		
		
	}
}
