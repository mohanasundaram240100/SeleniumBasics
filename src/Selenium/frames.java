package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class frames {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() 
	{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.iconplc.com");
	}
	
	@Test
	void test() 
	{
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		ArrayList<String> windowList = new ArrayList<String>(windowHandles);
		String parentWindow = windowList.get(0);
		String childWindow = windowList.get(1);
		
		driver.switchTo().window(childWindow);
		System.out.println("Child Window Title: " + driver.getTitle());
		
		driver.switchTo().frame(0);
		System.out.println("Frame Title: " + driver.getTitle());
		
		driver.switchTo().frame("frameName");
		System.out.println("Frame Title: " + driver.getTitle());
		
		driver.switchTo().defaultContent();
		System.out.println("Default Content Title: " + driver.getTitle());

		
	}
	
	
	
	@AfterClass 
	void tearDown() 
	{
		driver.quit();
	}
	

}
