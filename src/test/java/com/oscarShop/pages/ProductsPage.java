package com.oscarShop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    
    public static By productsPageNameLocator = By.xpath("//h1[contains(text(),'All products')]");
    public static By addToBasketLocator = By.cssSelector(".col-xs-6:nth-child(1) .btn");
    public static By viewBasketButtonLocator = By.xpath("//a[contains(@href, '/en-gb/basket/')]");


    public SelenideElement productsPageNameDisplayed() {
        return $(productsPageNameLocator);
    }

    public void clickAddToBasket() {
        $(addToBasketLocator).click();
    }

    public void clickOnViewBasketButton() {
        $(viewBasketButtonLocator).click();
    }
}
