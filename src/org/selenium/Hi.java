package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hi {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srile\\Videos\\PracticeSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form");
		
		WebElement com = driver.findElement(By.id("selenium_commands"));
		
		Select s = new Select(com);
		
		
		s.selectByIndex(2);
		s.selectByIndex(3);
		s.selectByIndex(4);
		s.selectByIndex(1);
		s.selectByIndex(0);
		
		
		s.deselectByVisibleText("Navigation Commands");
					
			
		
		
		
		
	}
}
