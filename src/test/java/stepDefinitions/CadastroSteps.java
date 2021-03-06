package stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import utils.Utils;

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
        driver = Utils.createChromeAsWebDriver(driver);
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

    @Given("O usuario acessa a tela de preenchimento de Automobile Insurance")
    public void usuarioAcessaAutomobileInsurance() {

        assertTrue(enterVehicleDataPage
                .isAtEnterVehicleDataPage())
        ;
    }

    @And("Preenche formulario EnterVehicleData corretamente")
    public void preencheFormularioEnterVehicleDataCorretamente() {
        enterVehicleDataPage
                .accessAbaAutomobileInsurance()
                .setMakeByIndex(1)
                .setEnginePerformace(2000)
                .setDateOfManufacture(Utils.criaDataAnteriorByAnos(3))
                .setNumberOfSeatsByIndex(1)
                .setFuelTypeByIndex(1)
                .setListPrice(45000)
                .setLicensePlateNumber("ABC 2345")
                .setAnnualMileage(9000)
                .clickNextButton()
        ;

    }

    @And("Preenche formulario EnterInsurantData corretamente")
    public void preencheFormularioEnterInsurantDataCorretamente() {
        enterInsurantDataPage
                .setFirstName("Nome")
                .setLastName("Sobrenome")
                .setDateOfBirth(Utils.criaDataAnteriorByAnos(20))
                .setGenderFemale()
                .setStreetAddress("Rua teste teste teste")
                .setCountry(1)
                .setZipCode("11000222")
                .setCity("Jo??o Pessoa")
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

    @And("Preenche formulario EnterProductData corretamente")
    public void preencheFormularioEnterProductDataCorretamente() {
        enterProductDataPage
                .setStartDate(Utils.criaDataFuturaByAnos(1))
                .setInsuranceSum(1)
                .setMeritRating(1)
                .setDamageInsurance(1)
                .setOptionalProductEuro()
                .setOptionalProductLegal()
                .setCourtesyCar(1)
                .clickNextButton()
        ;
    }

    @And("Preenche opcao de preco no SelectPriceOption corretamente")
    public void selecionaOpcaoPrecoSelectPriceOptionCorretamente() throws InterruptedException {
        selectPriceOptionPage
                .setOptionalSilver()
                .clickNextButton()
        ;

    }

    @And("Preenche formulario SendQuote corretamente")
    public void preencheFormularioSendQuoteCorretamente() {
        sendQuotePage
                .setEmail("email@email.com.br")
                .setPhone(12345678)
                .setUsername("Username")
                .setPassword("Teste@!123")
                .setConfirmPassword("Teste@!123")
                .setComments("Comentario")
        ;
    }

    @When("Clica no botao de enviar e finalizar cadastro")
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
