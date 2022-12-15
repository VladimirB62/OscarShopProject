package com.oscarShop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.oscarShop.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseURL = PropertiesLoader.loadProperty("url");
    public static By selectEnglishLocator = By.xpath("//select[@name='language']");
    private static String selectedLanguage = PropertiesLoader.loadProperty("language");
    public static By goLocator = By.cssSelector(".btn:nth-child(4)");
    public static By registerIconLocator = By.id("login_link");
    public static By logoutIconLocator = By.id("logout_link");
    public static By allProductsLocator = By.xpath("//a[contains(text(),'All products')]");


    public void clickOnLoginOrRegisterButton() {
        $(registerIconLocator).click();
    }

    public SelenideElement logoutButtonDisplayed() {
         return $(logoutIconLocator);
    }

    public void clickOnLogoutButton() {
        $(logoutIconLocator).click();
    }

    public SelenideElement loginOrRegisterButtonDisplayed() {
        return $(registerIconLocator);
    }

    public void clickOnAllProductsLink() {
        $(allProductsLocator).click();
    }

    public void chooseEnglish() {
        $(selectEnglishLocator).selectOptionByValue(selectedLanguage);
        $(goLocator).click();
    }
}
