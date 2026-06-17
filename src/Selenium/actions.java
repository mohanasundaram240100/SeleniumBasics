package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class actions {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	void mouseHover()
	{
		WebElement AccountAndLists =driver.findElement(By.xpath("//*[@class=\"nav-div\"]/following::span[contains(text(), 'Account & Lists')]"));
		WebElement Account = driver.findElement(By.xpath("//*[@class=\"nav-template nav-flyout-content\"]//a/span[contains(text(), 'Account')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(AccountAndLists).build().perform();
		action.moveToElement(Account).click().build().perform();
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
		
	}

}
