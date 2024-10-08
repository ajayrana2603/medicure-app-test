package com.testing.medicure_test_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {   
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless");
    	
    	WebDriver driver = new ChromeDriver(options);

        driver.get("http://18.224.3.103:8082/contact.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        
        WebElement firstName = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        firstName.sendKeys("Ajay");
        
                
        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        phoneNumber.sendKeys("43437878");

        
        WebElement eMail = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        eMail.sendKeys("ajay@rana.com");

        
        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        message.sendKeys("Hi! how are you?");

  
        WebElement submitButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        submitButton.click();

        
        String response = driver.findElement(By.id("message")).getText();
        System.out.println(response);
             driver.quit();
    }
}
