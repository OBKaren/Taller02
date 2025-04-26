package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "ctl00_MainContent_LoginControl1_TextBoxEmail")
    private WebElement emailInput;

    @FindBy(id = "ctl00_MainContent_LoginControl1_TextBoxPassword")
    private WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_LoginControl1_ButtonLogin")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        return loginButton.isDisplayed();
    }

    public void login(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}