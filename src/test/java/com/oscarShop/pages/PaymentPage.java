package com.oscarShop.pages;

import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {

    public static By paymentPageNameLocator = By.xpath("//h1[contains(text(),'Enter payment details')]");
    public static By continueBtnLocator = By.id("view_preview");

    public SelenideElement paymentPageNameDisplayed() {
        return $(paymentPageNameLocator);
    }

    public void clickOnContinueButton2() {
        $(continueBtnLocator).click();
    }
}
