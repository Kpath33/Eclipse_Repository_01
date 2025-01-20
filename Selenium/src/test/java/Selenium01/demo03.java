package Selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display an alert box:']")).click();
		driver.switchTo().alert().accept();
		
	}

}
