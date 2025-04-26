package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    @FindBy(id = "ctl00_MainContent_SignupControl1_TextBoxFullName")
    private WebElement fullNameInput;

    @FindBy(id = "ctl00_MainContent_SignupControl1_TextBoxEmail")
    private WebElement emailInput;

    @FindBy(id = "ctl00_MainContent_SignupControl1_TextBoxPassword")
    private WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_SignupControl1_CheckBoxTerms")
    private WebElement termsCheckbox;

    @FindBy(id = "ctl00_MainContent_SignupControl1_ButtonSignup")
    private WebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        return signUpButton.isDisplayed();
    }

    public void signUp(User user) {
        fullNameInput.sendKeys(user.getFullName());
        emailInput.sendKeys(user.getEmail());
        passwordInput.sendKeys(user.getPassword());
        termsCheckbox.click();
        signUpButton.click();
    }

    public void signUp(String fullName, String email, String password) {
        signUp(new User(email, password, fullName));
    }
}