package latestVersionTests;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import oscar.latest.pages.HeaderPage;
import oscar.latest.pages.LoginOrRegisterPage;
import oscar.latest.pages.ProfilePage;

public class ProfilePageTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HeaderPage(driver).selectLanguage("en-gb");
        new HeaderPage(driver).clickOnLoginOrRegisterButton();
        new LoginOrRegisterPage(driver).login("ronaldo37@gmail.com","123456Aa!");
        new HeaderPage(driver).clickAccountButton();
    }

    @Test
    public void editProfile() {
        new ProfilePage(driver).clickEditProfileButton();
        new ProfilePage(driver).addUsersData("Christiano","Ronaldo");
        Assert.assertTrue(new ProfilePage(driver).checkName().contains("Ronaldo"));
    }

}
