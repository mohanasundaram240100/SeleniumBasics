package Seleniumtuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By searchBox = By.name("q");
    private final By resultsStats = By.id("result-stats");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goTo() {
        driver.get("https://www.google.com/");
        // Accept cookies if the consent dialog appears (best-effort)
        try {
            By acceptButton = By.xpath("//button[.//div[text()='I agree'] or contains(., 'I agree') or contains(., 'Accept all')]");
            WebElement accept = wait.until(ExpectedConditions.elementToBeClickable(acceptButton));
            accept.click();
        } catch (Exception ignored) {
            // ignore if not present
        }
        wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
    }

    public void search(String query) {
        WebElement box = wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        box.clear();
        box.sendKeys(query);
        box.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(resultsStats));
    }

    public String getResultsStatsText() {
        try {
            return driver.findElement(resultsStats).getText();
        } catch (Exception e) {
            return "";
        }
    }
}
