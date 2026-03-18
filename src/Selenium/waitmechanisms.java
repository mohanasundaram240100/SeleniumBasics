package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitmechanisms {

	
public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://iconplc.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); //implicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("\"//*[@title='Home']/ancestor::div[1]\"")))); //explicit wait
		
		
		
		
	}
	
}
