package oscar.latest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Collection;

public class AddressPage extends PageBase{
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Add a new address')]")
    WebElement addNewAddressButton;

    public AddressPage clickAddNewAddressButton() {
        click(addNewAddressButton);
        return new AddressPage(driver);
    }

    @FindBy(id = "id_first_name")
    WebElement firstNameInput;

    @FindBy(id = "id_last_name")
    WebElement lastnameInput;

    @FindBy(id = "id_line1")
    WebElement line1Input;

    @FindBy(id = "id_line4")
    WebElement cityInput;

    @FindBy(id = "id_postcode")
    WebElement postCodeInput;

    @FindBy(id = "id_country")
    WebElement countryInput;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement saveButton;
    public AddressPage fillAddressForm(String firstName, String lastName, String firstAddress, String city, String postCode, String countryValue) {
        type(firstNameInput,firstName);
        type(lastnameInput,lastName);
        type(line1Input,firstAddress);
        type(cityInput,city);
        type(postCodeInput,postCode);
        Select countrySelect = new Select(countryInput);
        countrySelect.selectByValue(countryValue);
        click(saveButton);
        return new AddressPage(driver);
    }

    @FindBy(css = "[class*=\"alertinner wicon\"]")
    WebElement confirmMessage;

    public String checkConfirmationMessage() {
        return confirmMessage.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'Edit')]")
    WebElement editButton;

    public AddressPage clickEditButton() {
        click(editButton);
        return new AddressPage(driver);
    }

    @FindBy(css = "[class*=\"btn btn-secondary dropdown-toggle\"]")
    WebElement editDropdown;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    WebElement itemDelete;


    public AddressPage deleteAddress() {
        click(editDropdown);
        click(itemDelete);
        return new AddressPage(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement deleteButton;

    public AddressPage clickDeleteButton() {
        click(deleteButton);
        return new AddressPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Set as default shipping address')]")
    WebElement itemShippingAddress;

    public AddressPage setAddressAsDefault() {
        click(editDropdown);
        click(itemShippingAddress);
        return new AddressPage(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Default shipping address')]")
    WebElement defaultAddress;

    public boolean isElementPresent() {
        return defaultAddress.isDisplayed();
    }
}
