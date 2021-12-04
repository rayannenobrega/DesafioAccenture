package stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterVehicleDataPage;
import static org.junit.Assert.*;


public class CadastroSteps {

    private WebDriver driver;
    private EnterVehicleDataPage enterVehicleDataPage;
    private EnterInsurantDataPage enterInsurantDataPage;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );

        driver.get("http://sampleapp.tricentis.com/101/app.php");

        enterVehicleDataPage = new EnterVehicleDataPage(driver);
        enterInsurantDataPage = new EnterInsurantDataPage(driver);
    }

    @Given("O usuário confirma se está na página Tricentis")
    public void usuarioEntraNaPaginaTricentis() {

        assertTrue(enterVehicleDataPage
                .isAtEnterVehicleDataPage())
        ;
    }

    @When("Preenche o formulário EnterVehicleData corretamente")
    public void preencheFormularioEnterVehicleDataCorretamente(){
        enterVehicleDataPage
                .accessAbaAutomobileInsurance()
                .setMakeByIndex(1)
                .setEnginePerformace(2000)
                .setDateOfManufacture("04/04/2021")
                .setNumberOfSeatsByIndex(1)
                .setFuelTypeByIndex(1)
                .setListPrice(45000)
                .setLicensePlateNumber("ABC 2345")
                .setAnnualMileage(9000)
                .clickNextButton()
        ;

    }

    @And("Preenche formulário EnterInsurantData corretamente")
    public void preencheFormularioEnterInsurantDataCorretamente(){
        enterInsurantDataPage
                .setFirstName("Nome")
                .setLastName("Sobrenome")
                .setDateOfBirth("04/04/2000")
                .setGenderFemale()
                .setStreetAddress("Rua teste teste teste")
                .setCountry(1)
                .setZipCode("11000222")
                .setCity("João Pessoa")
                .setOccupation(1)
                .setHobbieCliffDiving()
                .setWebsite("www.site.com.br")
                .clickNextButton()
        ;
    }

}
