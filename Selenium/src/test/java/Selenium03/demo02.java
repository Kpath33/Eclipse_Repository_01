package Selenium03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("moneyiframe");       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement bseElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bseindex\"]")));     
        System.out.println("BSE Value: " + bseElement.getText());
        driver.switchTo().defaultContent();
        driver.quit();
    }


	}


