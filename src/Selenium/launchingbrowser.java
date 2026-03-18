package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchingbrowser {
	
	public static void main (String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.apple.com");
		System.out.println(driver.getTitle());
		
		WebElement iPhone = driver.findElement(By.xpath("//*[@class=\"module-content\"][1]"));
		iPhone.click();
		
		//driver.quit();
		
		
	}

}
