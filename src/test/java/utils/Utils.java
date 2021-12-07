package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String criaDataFuturaByAnos(int anos){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().plusYears(anos).format(formatter);
    }

    public static String criaDataAnteriorByAnos(int anos){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.now().minusYears(anos).format(formatter);
    }

    public static ChromeDriver createChromeAsWebDriver(WebDriver driver){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "assets/drivers/chromedriver.exe");
        return new ChromeDriver(options);
    }
}
