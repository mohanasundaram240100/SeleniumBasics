package Selenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main (String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://iconplc.com");

		driver.navigate().to("https://www.apple.com");
		System.out.println(driver.getTitle());

		URL url = new URL("https://www.amazon.com");
		driver.navigate().to(url);
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());


		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());


		driver.quit();




	}


}
