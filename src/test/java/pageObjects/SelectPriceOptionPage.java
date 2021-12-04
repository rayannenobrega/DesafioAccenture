package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SelectPriceOptionPage extends BasePage{

    public SelectPriceOptionPage(WebDriver driver) {
        super(driver);
    }

    private By selectOptionSilverBy = By.xpath("//input[@id=\"selectsilver\"]/..");
    private By selectOptionGoldBy = By.xpath("//input[@id=\"selectgold\"]/..");
    private By selectOptionPlatiniumBy = By.xpath("//input[@id=\"selectplatinum\"]/..");
    private By selectOptionUltimateBy = By.xpath("//input[@id=\"selectultimate\"]/..");
    private By nextButtonBy = By.id("nextsendquote");

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

    public SelectPriceOptionPage clickNextButton() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(nextButtonBy));
        driver.findElement(nextButtonBy).click();
        return this;
    }

}
