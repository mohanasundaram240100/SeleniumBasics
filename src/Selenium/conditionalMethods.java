package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class conditionalMethods {

	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://iconplc.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement Logo= driver.findElement(By.xpath("//*[@title='Home']/ancestor::div[1]"));	
		System.out.println("Logo is displayed = " + Logo.isDisplayed());   //isDisplayed method
		
		
		WebElement JobsAndCareer = driver.findElement(By.xpath("//*[contains(text(), \"Jobs & Careers\")]/child::span[1]"));	
		System.out.println("JobsAndCareer option = " + JobsAndCareer.isEnabled()); //isEnabled method
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), \"Jobs & Careers\")]/child::span[1]")));
		
		driver.quit();
	}
	
	
}
