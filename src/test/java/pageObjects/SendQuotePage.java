package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuotePage extends BasePage {

    public SendQuotePage(WebDriver driver) {
        super(driver);
    }

    private final By emailBy = By.id("email");
    private final By phoneBy = By.id("phone");
    private final By usernameBy = By.id("username");
    private final By passwordBy = By.id("password");
    private final By confirmPasswordBy = By.id("confirmpassword");
    private final By commentsBy = By.id("Comments");
    private final By sendButtonBy = By.id("sendemail");
    private final By sweetAlertMsgBy = By.xpath("//div['sweet-alert showSweetAlert visible']//h2");
    private final By sweetAlertButtonBy = By.xpath("//div['sweet-alert showSweetAlert visible']//button[@class='confirm']");

    public SendQuotePage setEmail(String email) {
        driver.findElement(emailBy).sendKeys(email);
        return this;
    }

    public SendQuotePage setPhone(int phone) {
        driver.findElement(phoneBy).sendKeys(Integer.toString(phone));
        return this;
    }

    public SendQuotePage setUsername(String username) {
        driver.findElement(usernameBy).sendKeys(username);
        return this;
    }

    public SendQuotePage setPassword(String password) {
        driver.findElement(passwordBy).sendKeys(password);
        return this;
    }

    public SendQuotePage setConfirmPassword(String password) {
        driver.findElement(confirmPasswordBy).sendKeys(password);
        return this;
    }

    public SendQuotePage setComments(String comment) {
        driver.findElement(commentsBy).sendKeys(comment);
        return this;
    }

    public SendQuotePage clickSendButton() {
        driver.findElement(sendButtonBy).click();
        return this;
    }

    public SendQuotePage isCadastroRealizadoComSucesso(){

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("confirm")));
        String msg = driver.findElement(sweetAlertMsgBy).getText();
        Assert.assertEquals("Sending e-mail success!", msg);
        return this;
    }

    public SendQuotePage clickSweetAlertButton(){
        driver.findElement(sweetAlertButtonBy).click();
        return this;
    }


}
