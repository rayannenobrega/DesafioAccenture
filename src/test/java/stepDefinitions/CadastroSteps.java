package stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.EnterVehicleDataPage;
import static org.junit.Assert.*;


public class CadastroSteps {

    private WebDriver driver;
    private EnterVehicleDataPage enterVehicleDataPage;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );

        driver.get("http://sampleapp.tricentis.com/101/app.php");

        enterVehicleDataPage = new EnterVehicleDataPage(driver);
    }

    @Given("O usuário confirma se está na página Tricentis")
    public void usuarioEntraNaPaginaTricentis() {

        assertTrue(enterVehicleDataPage
                .estaNaEnterVehicleDataPage())
        ;
    }

    @When("Preenche o formulário EnterVehicleData corretamente")
    public void preencheFormularioEnterVehicleDataCorretamente(){
        enterVehicleDataPage
                .acessaAbaAutomobileInsurance()
                .informaMakeByIndex(1)
                .informaEnginePerformace(2000)
                .informaDateOfManufacture("04/04/2021")
                .informaNumberOfSeatsByIndex(1)
                .informaFuelTypeByIndex(1)
                .informaListPrice(45000)
                .informaLicensePlateNumber("ABC 2345")
                .informaAnnualMileage(9000)
                .clicaNextButton()
        ;

    }


}
