package Selenium02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		//String wid = driver.getWindowHandle();
		//System.out.println(wid);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> WindosIDS = driver.getWindowHandles();
		//System.out.println(WindosIDS);
		
		Iterator<String> it = WindosIDS.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		System.out.println("Parent ID: " + parentId);
		System.out.println("Child ID: " + childId);
		
		//driver.switchTo().window(parentId);
		System.out.println("Parent Windos Title: " + driver.getTitle());
		
		driver.switchTo().window(childId);
		System.out.println("Child Windos Title: " + driver.getTitle());
		
		driver.close();
		//deiver.quit();
		
	}

}
