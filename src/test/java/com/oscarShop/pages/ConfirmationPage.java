package com.oscarShop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmationPage {

    public static By itemNameLocator = By.xpath("//a[contains(text(),\"The shellcoder's handbook\")]");

    public SelenideElement itemDisplayed() {
        return $(itemNameLocator);
    }
}
