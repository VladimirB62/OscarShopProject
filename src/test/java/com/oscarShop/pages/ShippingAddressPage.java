package com.oscarShop.pages;

import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.SelenideElement;
import com.oscarShop.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShippingAddressPage {
    
    public static By addressPageNameLocator = By.xpath("//h1[contains(text(),'Shipping address')]");
    public static By firstNameLocator = By.id("id_first_name");
    private static String validFirstName = PropertiesLoader.loadProperty("valid.first_name");
    public static By lastNameLocator = By.id("id_last_name");
    private static String validLastName = PropertiesLoader.loadProperty("valid.last_name");
    public static By addressLocator = By.id("id_line1");
    private static String validAddressName = PropertiesLoader.loadProperty("valid.address");
    public static By cityLocator = By.id("id_line4");
    private static String validCityName = PropertiesLoader.loadProperty("valid.city");
    public static By postCodeLocator = By.id("id_postcode");
    private static String validPostCode = PropertiesLoader.loadProperty("valid.post_code");
    public static By countryLocator = By.id("id_country");
    private static String validCountry = PropertiesLoader.loadProperty("valid.country");

    public static By continueButtonLocator = By.xpath("//button[contains(text(),'Continue')]");

    public SelenideElement addressNameDisplayed() {
        return $(addressPageNameLocator);
    }

    public void requieredFieldsInput() {
        $(firstNameLocator).setValue(validFirstName);
        $(lastNameLocator).setValue(validLastName);
        $(addressLocator).setValue(validAddressName);
        $(cityLocator).setValue(validCityName);
        $(postCodeLocator).setValue(validPostCode);
        $(countryLocator).selectOptionByValue(validCountry);
    }

    public void clickOnContinueButton() {
        $(continueButtonLocator).click();
    }
}
