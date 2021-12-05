package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleDataPage extends BasePage {

    public EnterVehicleDataPage(WebDriver driver) {
        super(driver);
    }

    private final By automobileNavBy = By.id("nav_automobile");
    private final By makeBy = By.id("make");
    private final By enginePerformaceBy = By.id("engineperformance");
    private final By dateOfManyfactureBy = By.id("dateofmanufacture");
    private final By numberOfSeatsBy = By.id("numberofseats");
    private final By fuelTypeBy = By.id("fuel");
    private final By listPriceBy = By.id("listprice");
    private final By licensePlateNumberBy = By.id("licenseplatenumber");
    private final By annualMileageBy = By.id("annualmileage");
    private final By nextButtonBy = By.id("nextenterinsurantdata");
    private final By headerBy = By.xpath("//*[@id=\"entervehicledata\"]/..");


    public EnterVehicleDataPage accessAbaAutomobileInsurance() {
        driver.findElement(automobileNavBy).click();
        return this;
    }

    public boolean isAtEnterVehicleDataPage() {
        return driver.findElement(headerBy).getAttribute("class").contains("idealsteps-step-active");
    }

    public EnterVehicleDataPage setMakeByIndex(int index) {
        Select makeDropDown = new Select(driver.findElement(makeBy));
        makeDropDown.selectByIndex(index);
        return this;
    }

    public EnterVehicleDataPage setEnginePerformace(int value) {
        driver.findElement(enginePerformaceBy).sendKeys(Integer.toString(value));
        return this;
    }

    public EnterVehicleDataPage setDateOfManufacture(String date) {
        driver.findElement(dateOfManyfactureBy).sendKeys(date);
        return this;
    }

    public EnterVehicleDataPage setNumberOfSeatsByIndex(int index) {
        Select seatDropDownm = new Select(driver.findElement(numberOfSeatsBy));
        seatDropDownm.selectByIndex(index);
        return this;
    }

    public EnterVehicleDataPage setFuelTypeByIndex(int index) {
        Select fuelDropDown = new Select(driver.findElement(fuelTypeBy));
        fuelDropDown.selectByIndex(index);
        return this;
    }

    public EnterVehicleDataPage setListPrice(double value) {
        driver.findElement(listPriceBy).sendKeys(Double.toString(value));
        return this;
    }

    public EnterVehicleDataPage setLicensePlateNumber(String value) {
        driver.findElement(licensePlateNumberBy).sendKeys(value);
        return this;
    }

    public EnterVehicleDataPage setAnnualMileage(double value) {
        driver.findElement(annualMileageBy).sendKeys(Double.toString(value));
        return this;
    }

    public EnterVehicleDataPage clickNextButton() {
        driver.findElement(nextButtonBy).click();
        return this;
    }
}
