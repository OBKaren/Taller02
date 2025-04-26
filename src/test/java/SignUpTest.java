import models.User;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.SignUpPage;
import utils.ConfigLoader;
import utils.TestDataGenerator;
import utils.WebDriverFactory;

public class SignUpTest {
    private WebDriver driver;
    private MainPage mainPage;
    private SignUpPage signUpPage;

    @BeforeEach
    public void setUp() {
        driver = WebDriverFactory.createDriver();
        driver.get(ConfigLoader.getBaseUrl());
        mainPage = new MainPage(driver);
    }

    @Test
    @DisplayName("Registro de nuevo usuario exitoso")
    public void testSuccessfulUserRegistration() {
        // Arrange
        User testUser = TestDataGenerator.generateRandomUser();

        // Act
        mainPage.goToSignUpPage();
        signUpPage = new SignUpPage(driver);
        signUpPage.signUp(testUser);

        // Assert
        Assertions.assertTrue(mainPage.isAt(), "El registro no fue exitoso");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}