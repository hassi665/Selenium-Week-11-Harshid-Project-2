package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {

        String baseURL = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.firefox.driver","drivers/firefoxdriver.exe");
        WebDriver driver = new FirefoxDriver();

        //launch the URL in FirefoxBrowser
        driver.get(baseURL);
        //maximize the browser's window
        driver.manage().window().maximize();
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        //Print the title of the page
        System.out.println("Page title is : " + driver.getTitle());

        //Print the current URL
        System.out.println("Current URL of page is : " + driver.getCurrentUrl());

        //Print the Page Source
        System.out.println("Page Source : " + driver.getPageSource());

        //Enter the Username to Username field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");


        //Enter the Password to Password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close the browser
        driver.close();

    }
}
