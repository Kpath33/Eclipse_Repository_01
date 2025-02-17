
package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By myAccountLink = By.xpath("//a[@href='https://demo.opencart.com/en-gb?route=account/account']");
	By registerLink = By.xpath("//a[@class='list-group-item'][normalize-space()='Register']");

	public void clickMyAccount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement myAccountElement = wait.until(ExpectedConditions.elementToBeClickable(myAccountLink));

		// Scroll to the element
		Actions actions = new Actions(driver);
		actions.moveToElement(myAccountElement).perform();

		// Ensure the element is visible and clickable
		if (myAccountElement.isDisplayed() && myAccountElement.isEnabled()) {
			myAccountElement.click();
		} else {
			// Use JavaScript to click the element if it is not interactable
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", myAccountElement);
		}
	}

	public void clickRegister() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement registerElement = wait.until(ExpectedConditions.elementToBeClickable(registerLink));

		// Scroll to the element
		Actions actions = new Actions(driver);
		actions.moveToElement(registerElement).perform();

		// Ensure the element is visible and clickable
		if (registerElement.isDisplayed() && registerElement.isEnabled()) {
			registerElement.click();
		} else {
			// Use JavaScript to click the element if it is not interactable
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", registerElement);
		}
	}

	public void clickMyAccountAndRegister() {
		clickMyAccount();
		clickRegister();
	}
}
