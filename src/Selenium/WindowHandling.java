package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[contains(text(), \"OrangeHRM, Inc\")]")).click();
		
		//System.out.println(driver.getWindowHandle());
		
		Set<String> windowIDs= driver.getWindowHandles();
		System.out.println(windowIDs);                    //to get the window IDs of all the open windows
		
		//To find the parent and child window IDs individually	
		//Since the Set collection does not allow duplicate values, we can convert the Set collection to a List collection to access the window IDs using index values
		
		//Method1: Using ArrayList
		ArrayList<String> windowList = new ArrayList<String>(windowIDs);
		String ParentWindowID = windowList.get(0); //parent window ID
		String ChildWindowID = windowList.get(1); //child window ID
		
		System.out.println(ParentWindowID);
		System.out.println(ChildWindowID);
		
		driver.switchTo().window(ChildWindowID); //switching the control to child window
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//Method2: Using for-each loop
		
		for (String winIDs : windowIDs) {
			
			driver.switchTo().window(winIDs);
			System.out.println(driver.getTitle());		
		}
		
		
		
		
		
		
		
		//driver.quit();
		
	}
	
}
