package oscar.latest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class LoginOrRegisterPage extends PageBase{
    public LoginOrRegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "id_registration-email")
    WebElement regEmail;

    @FindBy(id = "id_registration-password1")
    WebElement regPassword1;

    @FindBy(id = "id_registration-password2")
    WebElement regPassword2;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement regButton;

    public HeaderPage registration(String email, String password) {
        type(regEmail, email);
        type(regPassword1,password);
        type(regPassword2,password);
        click(regButton);

        return new HeaderPage(driver);
    }

    @FindBy(css = "[class*=\"error-block\"]")
    WebElement errorMessage;

    public String checkErrorMessage() {
        return errorMessage.getText();
    }

    public String registrationWithWrongConfirm(String email, String password, String confirm) {
        type(regEmail, email);
        type(regPassword1,password);
        type(regPassword2,confirm);
        click(regButton);
        return errorMessage.getText();
    }
}
