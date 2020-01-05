package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	ChromeOptions c = new ChromeOptions();
	ChromeOptions pop = c.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srile\\Videos\\Cucumber\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(pop);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Robot r = new Robot();
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("abinesh");
	
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
