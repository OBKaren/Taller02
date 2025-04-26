package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigLoader;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Configuración del tiempo de espera implícito
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(ConfigLoader.getTimeout()));
        PageFactory.initElements(driver, this);
    }

    public abstract boolean isAt();
}