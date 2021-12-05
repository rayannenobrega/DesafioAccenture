package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPriceOptionPage extends BasePage {

    public SelectPriceOptionPage(WebDriver driver) {
        super(driver);
    }

    private final By selectOptionSilverBy = By.xpath("//input[@id=\"selectsilver\"]/..");
    private final By selectOptionGoldBy = By.xpath("//input[@id=\"selectgold\"]/..");
    private final By selectOptionPlatiniumBy = By.xpath("//input[@id=\"selectplatinum\"]/..");
    private final By selectOptionUltimateBy = By.xpath("//input[@id=\"selectultimate\"]/..");
    private final By nextButtonBy = By.id("nextsendquote");

    public SelectPriceOptionPage setOptionalSilver() {
        driver.findElement(selectOptionSilverBy).click();
        return this;
    }

    public SelectPriceOptionPage setOptionalGold() {
        driver.findElement(selectOptionGoldBy).click();
        return this;
    }

    public SelectPriceOptionPage setOptionalPlatinium() {
        driver.findElement(selectOptionPlatiniumBy).click();
        return this;
    }

    public SelectPriceOptionPage setOptionalUltimate() {
        driver.findElement(selectOptionUltimateBy).click();
        return this;
    }

    public SelectPriceOptionPage clickNextButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonBy));
        driver.findElement(nextButtonBy).click();
        return this;
    }
}
