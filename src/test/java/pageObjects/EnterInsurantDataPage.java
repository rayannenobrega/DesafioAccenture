package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantDataPage extends BasePage {

    public EnterInsurantDataPage(WebDriver driver) {
        super(driver);
    }

    private final By firstNameBy = By.id("firstname");
    private final By lastNameBy = By.id("lastname");
    private final By dateOfBirthBy = By.id("birthdate");
    private final By genderMaleBy = By.xpath("//input[@id=\"gendermale\"]/..");
    private final By genderFemaleBy = By.xpath("//input[@id=\"genderfemale\"]/..");
    private final By streetAddressBy = By.id("streetaddress");
    private final By countryBy = By.id("country");
    private final By zipCodeBy = By.id("zipcode");
    private final By cityBy = By.id("city");
    private final By occupationBy = By.id("occupation");
    private final By hobbieSpeedingBy = By.xpath("//input[@id=\"speeding\"]/..");
    private final By hobbieBungeeJumpingBy = By.xpath("//input[@id=\"bungeejumping\"]/..");
    private final By hobbieCliffDivingBy = By.xpath("//input[@id=\"cliffdiving\"]/..");
    private final By hobbieSkydivingBy = By.xpath("//input[@id=\"skydiving\"]/..");
    private final By hobbieOtherBy = By.xpath("//input[@id=\"other\"]/..");
    private final By websiteBy = By.id("website");
    private final By pictureBy = By.id("picture");
    private final By pictureFileBy = By.id("picturecontainer");
    private final By nextButtonBy = By.id("nextenterproductdata");


    public EnterInsurantDataPage setFirstName(String name) {
        driver.findElement(firstNameBy).sendKeys(name);
        return this;
    }

    public EnterInsurantDataPage setLastName(String name) {
        driver.findElement(lastNameBy).sendKeys(name);
        return this;
    }

    public EnterInsurantDataPage setDateOfBirth(String date) {
        driver.findElement(dateOfBirthBy).sendKeys(date);
        return this;
    }

    public EnterInsurantDataPage setGenderMale() {
        driver.findElement(genderMaleBy).click();
        return this;
    }

    public EnterInsurantDataPage setGenderFemale() {
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

    public EnterInsurantDataPage setHobbieSpeeding() {
        driver.findElement(hobbieSpeedingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieBungeeJumping() {
        driver.findElement(hobbieBungeeJumpingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieCliffDiving() {
        driver.findElement(hobbieCliffDivingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieSkydiving() {
        driver.findElement(hobbieSkydivingBy).click();
        return this;
    }

    public EnterInsurantDataPage setHobbieOther() {
        driver.findElement(hobbieOtherBy).click();
        return this;
    }

    public EnterInsurantDataPage setWebsite(String site) {
        driver.findElement(websiteBy).sendKeys(site);
        return this;
    }

    public EnterInsurantDataPage uploadPicture() {
        driver.findElement(pictureFileBy).sendKeys(System.getProperty("user.dir") + "/assets/images/img.jpg");
        driver.findElement(pictureBy).sendKeys("img.jpg");
        return this;
    }

    public EnterInsurantDataPage clickNextButton() {
        driver.findElement(nextButtonBy).click();
        return this;
    }
}
