package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleDataPage extends BasePage {

    public EnterVehicleDataPage(WebDriver driver) { super(driver); }

    private By makeBy = By.id("make");
    private By enginePerformaceBy = By.id("engineperformance");
    private By dateOfManyfactureBy = By.id("dateofmanufacture");
    private By numberOfSeatsBy = By.id("numberofseats");
    private By fuelTypeBy = By.id("fuel");
    private By listPriceBy = By.id("listprice");
    private By licensePlateNumberBy = By.id("licenseplatenumber");
    private By annualMileageBy = By.id("annualmileage");
    private By nextButtonBy = By.id("nextenterinsurantdata");

    public void informaMakeByIndex(int index){
        Select makeDropDown = new Select(driver.findElement(makeBy));
        makeDropDown.selectByIndex(index);
    }

    public void informaEnginePerformace(int value){
        driver.findElement(enginePerformaceBy).sendKeys(Integer.toString(value));
    }

    //precisa ser uma data inferior ao dia atual
    public void informaDateOfManufacture(String date){
        driver.findElement(dateOfManyfactureBy).sendKeys(date);
    }

    public void informaNumberOfSeatsByValue(String value){
        Select seatDropDownm = new Select(driver.findElement(numberOfSeatsBy));
        seatDropDownm.selectByValue(value);
    }

    public void informaFuelType(int index){
        Select fuelDropDown = new Select(driver.findElement(fuelTypeBy));
        fuelDropDown.selectByIndex(index);
    }

    public void informaListPrice(double value){
        driver.findElement(listPriceBy).sendKeys(Double.toString(value));
    }

    public void informaLicensePlateNumber(String value){
        driver.findElement(licensePlateNumberBy).sendKeys(value);
    }

    public void informaAnnualMileage (double value){
        driver.findElement(annualMileageBy).sendKeys(Double.toString(value));
    }

    public void clicaNextButton(){
        driver.findElement(nextButtonBy).click();
    }

}
