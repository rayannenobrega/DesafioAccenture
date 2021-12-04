package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuotePage extends BasePage {

    public SendQuotePage(WebDriver driver) { super(driver); }

    private By emailBy = By.id("email");
    private By phoneBy = By.id("phone");
    private By usernameBy = By.id("username");
    private By passwordBy = By.id("password");
    private By confirmPasswordBy = By.id("confirmpassword");
    private By commentsBy = By.id("Comments");
    private By sendButtonBy = By.id("sendemail");

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
}
