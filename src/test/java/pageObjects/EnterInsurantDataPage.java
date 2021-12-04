package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantDataPage extends BasePage{

    public EnterInsurantDataPage(WebDriver driver) {
        super(driver);
    }

    private By firstNameBy = By.id("firstname");
    private By lastNameBy = By.id("lastname");
    private By dateOfBirthBy = By.id("birthdate");
    private By genderMaleBy = By.xpath("//input[@id=\"gendermale\"]/..");
    private By genderFemaleBy = By.xpath("//input[@id=\"genderfemale\"]/..");
    private By streetAddressBy = By.id("streetaddress");
    private By countryBy = By.id("country");
    private By zipCodeBy = By.id("zipcode");
    private By cityBy = By.id("city");
    private By occupationBy = By.id("occupation");
    private By hobbieSpeedingBy = By.xpath("//input[@id=\"speeding\"]/..");
    private By hobbieBungeeJumpingBy = By.xpath("//input[@id=\"bungeejumping\"]/..");
    private By hobbieCliffDivingBy =By.xpath("//input[@id=\"cliffdiving\"]/..");
    private By hobbieSkydivingBy = By.xpath("//input[@id=\"skydiving\"]/..");
    private By hobbieOtherBy = By.xpath("//input[@id=\"other\"]/..");
    private By websiteBy = By.id("website");
    private By pictureBy = By.id("picture");
   // private By headerBy = By.xpath("//*[@id=\"enterinsurantdata\"]/..");
    private By nextButtonBy = By.id("nextenterproductdata");


//    public boolean isAtEnterInsuranceDataPage() {
//
//        return driver.findElement(headerBy).getAttribute("class").contains("idealsteps-step-active");
//
//    }

    public EnterInsurantDataPage setFirstName(String name) {
        driver.findElement(firstNameBy).sendKeys(name);
        return this;
    }

    public EnterInsurantDataPage setLastName(String name) {
        driver.findElement(lastNameBy).sendKeys(name);
        return this;
    }

    //precisa ter 18 anos
    public EnterInsurantDataPage setDateOfBirth(String date) {
        driver.findElement(dateOfBirthBy).sendKeys(date);
        return this;
    }

    public EnterInsurantDataPage setGenderMale () {
        driver.findElement(genderMaleBy).click();
        return this;
    }

    public EnterInsurantDataPage setGenderFemale () {
        driver.findElement(genderFemaleBy).click();
        return this;
    }

    public EnterInsurantDataPage setStreetAddress(String address) {
        driver.findElement(streetAddressBy).sendKeys(address);
        return this;
    }

    public EnterInsurantDataPage setCountry(int index) {
        Select countryDropDown = new Select(driver.findElement(countryBy));
        countryDropDown.selectByIndex(index);
        return this;
    }

    public EnterInsurantDataPage setZipCode(String zipCode) {
        driver.findElement(zipCodeBy).sendKeys(zipCode);
        return this;
    }

    public EnterInsurantDataPage setCity(String city) {
        driver.findElement(cityBy).sendKeys(city);
        return this;
    }

    public EnterInsurantDataPage setOccupation(int index) {
        Select occupationDropDown = new Select(driver.findElement(occupationBy));
        occupationDropDown.selectByIndex(index);
        return this;
    }

    // Hobbies
    public EnterInsurantDataPage setHobbieSpeeding () {
        driver.findElement(hobbieSpeedingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieBungeeJumping () {
        driver.findElement(hobbieBungeeJumpingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieCliffDiving () {
        driver.findElement(hobbieCliffDivingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieSkydiving () {
        driver.findElement(hobbieSkydivingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieOther () {
        driver.findElement(hobbieOtherBy).click();
        return this;
    }
    //Fim de Hobbies

    public EnterInsurantDataPage setWebsite(String site) {
        driver.findElement(websiteBy).sendKeys(site);
        return this;
    }

    public EnterInsurantDataPage clickNextButton() {
        driver.findElement(nextButtonBy).click();
        return this;
    }
}
