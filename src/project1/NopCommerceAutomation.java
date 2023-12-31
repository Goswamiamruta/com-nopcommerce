package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NopCommerceAutomation {


    public static void main(String[] args) throws InterruptedException {
        String baseURL = "https://demo.nopcommerce.com/";
        //Step:1 Setup Chrome Browser
        WebDriver driver = new ChromeDriver();//implemented by WebDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//add implicit waiting
        driver.manage().window().maximize();//to maximise browser screen
        //Step:2 OpenURL
        driver.get(baseURL);
        //Step:3 Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());
        // Step 4: Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Step 5: Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        // Step 6: Navigate to URL
        String loginURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Thread.sleep(5000); // for holding or slowing down
        driver.navigate().to(loginURL);
        // Step 7: Print the current URL
        System.out.println("Current URL after navigation: " + driver.getCurrentUrl());
        // Step 8: Navigate back to the homepage
        driver.navigate().back();
        // Step 9: Navigate to the login page
        driver.navigate().to(loginURL);
        // Step 10: Print the current URL
        System.out.println("Current URL on login page: " + driver.getCurrentUrl());
        // Step 11: Refresh the page
        driver.navigate().refresh();
        // Step 12: Enter email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime@gmail.com");
        // Step 13: Enter password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("123456");
        // Step 14: Click on Login Button
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginButton.click();
        // Step 15: Close the browser
        driver.quit();


    }

}
