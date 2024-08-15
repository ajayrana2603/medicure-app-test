package com.testing.medicure_test_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver driver = new ChromeDriver();

        driver.get("http://18.222.156.149:8082/contact.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        
        WebElement firstName = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        firstName.sendKeys("Ajay");
        
        Thread.sleep(2000);
                
        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        phoneNumber.sendKeys("43437878");

        Thread.sleep(2000);
        
        WebElement eMail = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        eMail.sendKeys("ajay@rana.com");

        Thread.sleep(2000);
        
        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        message.sendKeys("Hi! how are you?");

        Thread.sleep(2000);
        
        WebElement submitButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        submitButton.click();

        Thread.sleep(2000);
        
        String response = driver.findElement(By.id("message")).getText();
        System.out.println(response);
             driver.quit();
    }
}
