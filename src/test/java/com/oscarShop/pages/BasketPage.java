package com.oscarShop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    public static By basketNameLocator = By.xpath("//h1[contains(text(),'Basket')]");
    public static By proceedToLocator = By.xpath("//a[contains(text(),'Proceed to checkout')]");

    public SelenideElement nameBasketDisplayed() {
        return $(basketNameLocator);
    }

    public void clickProceedToCheckout() {
        $(proceedToLocator).click();
    }
}
