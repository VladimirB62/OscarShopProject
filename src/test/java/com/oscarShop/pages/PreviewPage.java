package com.oscarShop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PreviewPage {

    public static By previewNameLocator = By.xpath("//h1[contains(text(),'Preview order')]");
    public static By placeOrderLocator = By.id("place-order");

    public SelenideElement previewNameDisplayed() {
        return $(previewNameLocator);
    }

    public void clickOnPlaceOrderButton() {
        $(placeOrderLocator).click();
    }
}
