import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the URL
            driver.get("https://www.amazon.in");

            // Find all <img> tags
            List<WebElement> list = driver.findElements(By.tagName("img"));

            // Print the number of <img> tags
            System.out.println("Number of <img> tags: " + list.size());

            // Print the src attribute of each <img> tag
            for (WebElement imgTag : list) {
                System.out.println("Image source: " + imgTag.getAttribute("src"));
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}