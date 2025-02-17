
package testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

    @Test
    public void verify_account_registration() {
        logger.info("***** Starting TC001_AccountRegistrationTest  ****");
        logger.debug("This is a debug log message");
        try {
            HomePage hp = new HomePage(driver);
            hp.clickMyAccount();
            logger.info("Clicked on MyAccount Link.. ");

            // Increase explicit wait timeout
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Register']")));

            // Scroll to the Register link
            Actions actions = new Actions(driver);
            actions.moveToElement(registerLink).perform();

            // Ensure the element is visible and clickable
            if (registerLink.isDisplayed() && registerLink.isEnabled()) {
                registerLink.click();
            } else {
                // Use JavaScript to click the element if it is not interactable
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", registerLink);
            }
            logger.info("Clicked on Register Link.. ");

            AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

            logger.info("Providing customer details...");
            regpage.setFirstName(randomeString().toUpperCase());
            regpage.setLastName(randomeString().toUpperCase());
            regpage.setEmail(randomeString() + "@gmail.com"); // randomly generated the email
            regpage.setTelephone(randomeNumber());

            String password = randomAlphaNumeric();

            regpage.setPassword(password);
            regpage.setConfirmPassword(password);

            regpage.setPrivacyPolicy();
            regpage.clickContinue();

            logger.info("Validating expected message..");

            String confmsg = regpage.getConfirmationMsg();
            Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");

            logger.info("Test passed");
        } catch (Exception e) {
            logger.error("Test failed: " + e.getMessage());
            Assert.fail("Test failed: " + e.getMessage());
        } finally {
            logger.info("***** Finished TC001_AccountRegistrationTest *****");
        }
    }
}
