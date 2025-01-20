package Selenium02;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo03 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("E:\\eclipse-workspace\\Selenium\\Screenshot\\facebook.png");
		
		WebElement abc =	driver.findElement(By.xpath("//input[@id='imagesrc']"));
		Actions act = new Actions(driver);
		act.click(abc).build().perform();
		
		Robot rb = new Robot();
		rb.setAutoDelay(2000);
		
		StringSelection sel = new StringSelection("E:\\eclipse-workspace\\Selenium\\Screenshot\\facebook.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
