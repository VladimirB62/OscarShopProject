package latestVersionTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import oscar.latest.pages.ProfilePage;

public class AddressPageTests extends ProfilePageTests {

    @BeforeMethod
    public void preconditions() {
        new ProfilePage(driver).clickAddressBookLink();
    }

    @Test//2.3.3.1
    public void addNewAddress() {

    }

    @Test//2.3.3.2
    public void editAddress() {

    }

    @Test//2.3.3.3
    public void deleteAddress() {

    }

    @Test//2.3.3.4
    public void selectAddressAsDefault() {

    }

}
