package com.oscarShop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.oscarShop.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginAndRegistrationPage {

    private static By registerFormLocator = By.id("register_form");

    private static By emailInputLocator = By.id("id_registration-email");
    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static By passwordInputLocator = By.id("id_registration-password1");
    private static String validPassword = PropertiesLoader.loadProperty("valid.password");
    private static By confirmInputLocator = By.id("id_registration-password2");
    private static By registerButtonLocator = By.xpath("//button[contains(text(),'Register')]");

    private static By logInEmailLocator = By.id("id_login-username");
    private static By logInPasswordLocator = By.id("id_login-password");
    private static By logInButtonLocator = By.name("login_submit");

    public SelenideElement registerFormDisplayed() {
        return $(registerFormLocator);
    }

    public void validRegistrationInput() {
        $(emailInputLocator).setValue(validEmail);
        $(passwordInputLocator).setValue(validPassword);
        $(confirmInputLocator).setValue(validPassword);
    }

    public void clickOnRegisterButton() {
        $(registerButtonLocator).click();
    }

    public void validLoginInput() {
        $(logInEmailLocator).setValue(validEmail);
        $(logInPasswordLocator).setValue(validPassword);
    }


    public void clickOnLogInButton() {
        $(logInButtonLocator).click();
    }
}
