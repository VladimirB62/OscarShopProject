package latestVersionTests;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import oscar.latest.pages.AddressPage;
import oscar.latest.pages.ProfilePage;

public class AddressPageTests extends ProfilePageTests {

    @BeforeMethod
    public void preconditions() {
        new ProfilePage(driver).clickAddressBookLink();
    }

    @Test//2.3.3.1
    public void addNewAddress() {
        new AddressPage(driver).clickAddNewAddressButton();
        new AddressPage(driver).fillAddressForm("Christiano","Ronaldo","Lenina street 30","Lissabon","84503","AQ");
        Assert.assertTrue(new AddressPage(driver).checkConfirmationMessage().contains("created"));
    }

    @Test//2.3.3.2
    public void editAddress() {
        new AddressPage(driver).clickEditButton();
        new AddressPage(driver).fillAddressForm("Chris","Ron","Mira street 15","Manchester","356030","AG");
        Assert.assertTrue(new AddressPage(driver).checkConfirmationMessage().contains("updated"));
    }

    @Test//2.3.3.3
    public void deleteAddress() {
        new AddressPage(driver).deleteAddress();
        new AddressPage(driver).clickDeleteButton();
        Assert.assertTrue(new AddressPage(driver).checkConfirmationMessage().contains("deleted"));
    }

    @Test//2.3.3.4
    public void selectAddressAsDefault() {
        new AddressPage(driver).setAddressAsDefault();
        Assert.assertTrue(new  AddressPage(driver).isElementPresent());
    }

}
