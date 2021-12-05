package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterProductDataPage extends BasePage {

    public EnterProductDataPage(WebDriver driver) {
        super(driver);
    }

    private final By startDateBy = By.id("startdate");
    private final By insuranceSumBy = By.id("insurancesum");
    private final By meritRatingBy = By.id("meritrating");
    private final By damageInsuranceBy = By.id("damageinsurance");
    private final By optionalProductsEuroBy = By.xpath("//input[@id=\"EuroProtection\"]/..");
    private final By optionalProductsLegalBy = By.xpath("//input[@id=\"LegalDefenseInsurance\"]/..");
    private final By courtesyCarBy = By.id("courtesycar");
    private final By nextButtonBy = By.id("nextselectpriceoption");

    //precisa ser 1 mês no futuro
    public EnterProductDataPage setStartDate(String date) {
        driver.findElement(startDateBy).sendKeys(date);
        return this;
    }

    public EnterProductDataPage setInsuranceSum(int index) {
        Select insuranceDropDown = new Select(driver.findElement(insuranceSumBy));
        insuranceDropDown.selectByIndex(index);
        return this;
    }

    public EnterProductDataPage setMeritRating(int index) {
        Select meritDropDown = new Select(driver.findElement(meritRatingBy));
        meritDropDown.selectByIndex(index);
        return this;
    }

    public EnterProductDataPage setDamageInsurance(int index) {
        Select damageDropDown = new Select(driver.findElement(damageInsuranceBy));
        damageDropDown.selectByIndex(index);
        return this;
    }

    public EnterProductDataPage setOptionalProductEuro() {
        driver.findElement(optionalProductsEuroBy).click();
        return this;
    }

    public EnterProductDataPage setOptionalProductLegal() {
        driver.findElement(optionalProductsLegalBy).click();
        return this;
    }

    public EnterProductDataPage setCourtesyCar(int index) {
        Select courtesyDropDown = new Select(driver.findElement(courtesyCarBy));
        courtesyDropDown.selectByIndex(index);
        return this;
    }

    public EnterProductDataPage clickNextButton() {
        driver.findElement(nextButtonBy).click();
        return this;
    }

}
