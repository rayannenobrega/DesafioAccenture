package stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.*;

import static org.junit.Assert.assertTrue;


public class CadastroSteps {

    private WebDriver driver;
    private EnterVehicleDataPage enterVehicleDataPage;
    private EnterInsurantDataPage enterInsurantDataPage;
    private EnterProductDataPage enterProductDataPage;
    private SelectPriceOptionPage selectPriceOptionPage;
    private SendQuotePage sendQuotePage;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

        driver.get("http://sampleapp.tricentis.com/101/app.php");

        enterVehicleDataPage = new EnterVehicleDataPage(driver);
        enterInsurantDataPage = new EnterInsurantDataPage(driver);
        enterProductDataPage = new EnterProductDataPage(driver);
        selectPriceOptionPage = new SelectPriceOptionPage(driver);
        sendQuotePage = new SendQuotePage(driver);
    }

    @After
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Given("O usuário acessa a tela de preenchimento de Automobile Insurance")
    public void usuarioAcessaAutomobileInsurance() {

        assertTrue(enterVehicleDataPage
                .isAtEnterVehicleDataPage())
        ;
    }

    @And("Preenche formulário EnterVehicleData corretamente")
    public void preencheFormularioEnterVehicleDataCorretamente() {
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
    public void preencheFormularioEnterInsurantDataCorretamente() {
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
                .setHobbieBungeeJumping()
                .setHobbieSkydiving()
                .setHobbieSpeeding()
                .setHobbieCliffDiving()
                .setHobbieOther()
                .setWebsite("www.site.com.br")
                .uploadPicture()
                .clickNextButton()
        ;
    }

    @And("Preenche formulário EnterProductData corretamente")
    public void preencheFormularioEnterProductDataCorretamente() {
        enterProductDataPage
                .setStartDate("04/04/2022")
                .setInsuranceSum(1)
                .setMeritRating(1)
                .setDamageInsurance(1)
                .setOptionalProductEuro()
                .setOptionalProductLegal()
                .setCourtesyCar(1)
                .clickNextButton()
        ;
    }

    @And("Preenche opção de preço no SelectPriceOption corretamente")
    public void selecionaOpcaoPrecoSelectPriceOptionCorretamente() throws InterruptedException {
        selectPriceOptionPage
                .setOptionalSilver()
                .clickNextButton()
        ;

    }

    @And("Preenche formulário SendQuote corretamente")
    public void preencheFormularioSendQuoteCorretamente() {
        sendQuotePage
                .setEmail("email@email.com.br")
                .setPhone(12345678)
                .setUsername("Username")
                .setPassword("Teste@!123")
                .setConfirmPassword("Teste@!123")
                .setComments("Comentário")
        ;
    }

    @When("Clica no botão de enviar e finalizar cadastro")
    public void clicaNoBotaoEnviarCadastro(){
        sendQuotePage
                .clickSendButton()
        ;

    }

    @Then("Realiza cadastro com Sucesso")
    public void realizaCadastroComSucesso() {

        sendQuotePage
                .isCadastroRealizadoComSucesso()
                .clickSweetAlertButton()
        ;

    }

}
