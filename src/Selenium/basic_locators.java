package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_locators {

	//write main method
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https:www.plcicon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		//List<WebElement> headerlink = driver.findElements(By.xpath("//li[@class='nav-li']"));
		//List<WebElement> headerlink =driver.findElements(By.className("nav-li"));
		//System.out.println("Number of header links: " + headerlinks.size());

		/*WebElement language = driver.findElement(By.xpath("//div[text()=\"EN\"]"));
		System.out.println(language.getText());
		language.click();
		*/

		//(//*[text()="value" and @placeholder="value"]);
		//driver.findElement(By.xpath("//tagname[contains(@attribute, 'value')]")).click();

		//driver.findElement(By.xpath("//div/h2[contains(text(), 'Automotive")).click();

		//*[text()=' Electronics ']/parent::div
		//*[@class="value"]/child::span
		//*[contains(text(), 'value')]/parent::span


		//*[@class="value"]/ancestor::div
		//*[contains(@class="value")]/descendant::input


		driver.quit();


	}

}
