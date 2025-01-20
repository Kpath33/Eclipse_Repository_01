package Selenium02;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\eclipse-workspace\\Selenium\\Screenshot\\facebook.png");
		try {
            FileUtils.copyFile(src, des);
        } catch (Exception e) {
	
	}

	}
	}
