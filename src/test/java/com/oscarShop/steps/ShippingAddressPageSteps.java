package com.oscarShop.steps;

import com.oscarShop.pages.ShippingAddressPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class ShippingAddressPageSteps implements En {
    ShippingAddressPage address;

    public ShippingAddressPageSteps() {
        Then("Shipping address page displayed",() ->{
            address = page(ShippingAddressPage.class);
            address.addressNameDisplayed().shouldHave(text("Shipping address"));
        });

        When("Enter required fields",() ->{
            address.requieredFieldsInput();
        });

        And("Click on Continue button",() ->{
            address.clickOnContinueButton();
        });
    }
}
