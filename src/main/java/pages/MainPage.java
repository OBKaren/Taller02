package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(className = "HPHeaderSignup")
    private WebElement signUpLink;

    @FindBy(className = "HPHeaderLogin")
    private WebElement loginLink;

    public MainPage(WebDriver driver) {
        super(driver);
    }



    @Override
    public boolean isAt() {
        return signUpLink.isDisplayed() && loginLink.isDisplayed();
    }

    public void goToSignUpPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(signUpLink));
        signUpLink.click();
    }

    public void goToLoginPage() {
        loginLink.click();
    }
}