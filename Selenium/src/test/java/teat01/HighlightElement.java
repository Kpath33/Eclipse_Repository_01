package teat01;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {
    public static void main(String[] args) throws InterruptedException {
        // Set the path for the WebDriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the target URL
        driver.get("https://demo.opencart.com/en-gb?route=account/login");

        // Locate the third 'Register' link using XPath
        WebElement registerLink = driver.findElement(By.xpath("(//a[.='Register'])[3]"));

        // Highlight the element
        highlightElement(driver, registerLink);

        // Optional: Perform actions on the element (e.g., clicking)
        // registerLink.click();

        // Close the driver after execution
        Thread.sleep(5000); // Keep the browser open for a while to observe
        driver.quit();
    }

    // Function to highlight an element
    public static void highlightElement(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Save the original style of the element
        String originalStyle = element.getAttribute("style");

        // Set the highlight style
        String highlightStyle = "background: yellow; border: 2px solid red;";

        // Apply the highlight style
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, highlightStyle);

        // Pause for observation
        Thread.sleep(2000);

        // Revert to the original style
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
    }
}
