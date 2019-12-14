package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hello {
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srile\\Videos\\Cucumber\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
	driver.manage().window().maximize();
	
	
	Thread.sleep(3000);
	
	WebElement down = driver.findElement(By.xpath("//a[text()='Execute Python']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	js.executeScript("arguments[0].scrollIntoView(true)", down);
	

	Thread.sleep(3000);
	WebElement up = driver.findElement(By.xpath("//span[text()='Blog']"));
	
	
	
	js.executeScript("arguments[0].scrollIntoView(false)", up);
	
	Thread.sleep(3000);
	
	 driver.quit();
	 
	 
	 
	 
	
	
	 
	 
}
}
