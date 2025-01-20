package DataDrivenTesting_hybrid;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataDrivenTesting01 {
    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    @BeforeClass
    public void beforeClass() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
    }

    @Test
    public void test() throws IOException {
        // Load Excel file
        File src = new File("E:\\eclipse-workspace\\Selenium\\Excel File\\datadriventestTestNG.xlsx");
        FileInputStream abc = new FileInputStream(src);
        workbook = new XSSFWorkbook(abc);
        sheet = workbook.getSheetAt(0);

        // Iterate through Excel rows
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {  
            // Read email from the Excel file
            cell = sheet.getRow(i).getCell(0);
            if (cell != null) {
            cell.setCellType(CellType.STRING);
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

            // Read password from the Excel file
            cell = sheet.getRow(i).getCell(1);
            if (cell != null) {
            cell.setCellType(CellType.STRING);
            driver.findElement(By.id("pass")).clear();
            driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

            // Optionally, submit the form or perform other actions here
            driver.findElement(By.name("login")).click();
        }

        //Close the Excel file stream
        abc.close();
    }

    @AfterClass
    public void afterClass() {
       // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
