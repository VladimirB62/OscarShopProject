package oscar.latest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.jvm.hotspot.gc.z.ZAddressRangeMapForPageTable;

import java.util.Collection;

public class ProfilePage extends PageBase{
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//a[contains(text(),'Edit profile')]")
    WebElement editProfileButton;

    public ProfilePage clickEditProfileButton() {
        click(editProfileButton);
        return new ProfilePage(driver);
    }

    @FindBy(id = "id_first_name")
    WebElement firstNameInput;

    @FindBy(id = "id_last_name")
    WebElement lastNameInput;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement saveButton;

    public ProfilePage addUsersData(String firstName, String lastName) {
        type(firstNameInput,firstName);
        type(lastNameInput,lastName);
        click(saveButton);
        return new ProfilePage(driver);
    }

    @FindBy(xpath = "//td[contains(text(),'Christiano Ronaldo')]")
    WebElement usersName;

    public String checkName() {
        return usersName.getText();
    }

    @FindBy(id = "delete_profile")
    WebElement deleteProfile;

    public ProfilePage clickDeleteProfileButton() {
        click(deleteProfile);
        return new ProfilePage(driver);
    }

    @FindBy(id = "id_password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement deleteButton;

    public HomePage confirmDelete(String password) {
        type(passwordInput,password);
        click(deleteButton);
        return new HomePage(driver);
    }

    @FindBy(linkText = "Address Book")
    WebElement addressBookLink;

    public AddressPage clickAddressBookLink() {
        click(addressBookLink);
        return new AddressPage(driver);
    }
}
