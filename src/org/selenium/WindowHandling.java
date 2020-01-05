package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

public class WindowHandling {
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srile\\Videos\\Cucumber\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	
	
	WebElement search = driver.findElement(By.id("inputValEnter"));
	search.sendKeys("iphone5s");
	
	WebElement cli = driver.findElement(By.className("searchTextSpan"));
	cli.click();
	
	WebElement f = driver.findElement(By.xpath("//p[text()='Apple iPhone 5S Soft Silicon Cases Hopsack - Transparent']"));
	f.click();
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	List<String>li = new ArrayList<>();
	
	li.addAll(all);
	
	driver.switchTo().window(li.get(1));
	
	WebElement add = driver.findElement(By.xpath("//span[text()='add to cart']"));
	add.click();
	
	
	Thread.sleep(3000);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

