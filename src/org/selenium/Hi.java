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
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.23920632.317864489.1576672054-956579179.1576672054");
		
		WebElement x = driver.findElement(By.xpath("//frame[@src='RSLogin.html?v=12']"));
		driver.switchTo().frame(x);
		
		
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("abinesh");
					
			
		
		
		
		
	}
}
