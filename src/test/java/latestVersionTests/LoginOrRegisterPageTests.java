package latestVersionTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import oscar.latest.pages.HeaderPage;
import oscar.latest.pages.LoginOrRegisterPage;

public class LoginOrRegisterPageTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HeaderPage(driver).selectLanguage("en-gb");
        new HeaderPage(driver).clickOnLoginOrRegisterButton();
    }

    @Test(enabled = false)//2.1.1
    public void RegistrationPositiveTest(){
        new LoginOrRegisterPage(driver).registration("ronaldo37@gmail.com","123456Aa!");
        new HeaderPage(driver).verifySuccessfullRegistration().logout();
    }

    @Test //2.1.2.1
    public void userRegistrationWithExistedtEmail(){
        new LoginOrRegisterPage(driver).registration("ronaldo37@gmail.com","123456Aa!");
        Assert.assertTrue(new LoginOrRegisterPage(driver).checkErrorMessage().contains("already exists"));
    }

    @Test //2.1.2.4
    public void userRegistartionWithShortPassword() {
        new LoginOrRegisterPage(driver).registration("ronaldo38@gmail.com", "123Aa!");
        Assert.assertTrue(new LoginOrRegisterPage(driver).checkErrorMessage().contains("at least 9 characters"));
    }

    @Test //2.1.2.3
    public void userRegistrationWithCommonUsedPassword() {
        new LoginOrRegisterPage(driver).registration("ronaldo38@gmail.com","123456789");
        Assert.assertTrue(new LoginOrRegisterPage(driver).checkErrorMessage().contains("too common"));
    }

    @Test //2.1.2.5
    public void userRegistrationWithDifferentValuesInPasswordAndConfirmPasswordField() {
        new LoginOrRegisterPage(driver).registrationWithWrongConfirm("ronaldo38@gmail.com","123456Aa!","123456aA!");
        Assert.assertTrue(new LoginOrRegisterPage(driver).checkErrorMessage().contains("didn't match"));
    }



}
