
package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {
	
	public static void main (String [] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByIndex(5);
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		select1.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByValue("1990");
		
		//Bootstrap drop down
		driver.get("https://www.hyrtutorials.com/p/bootstrap-dropdowns-practice.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));	
		
		
		
		
		//driver.quit();
		
	}

}
