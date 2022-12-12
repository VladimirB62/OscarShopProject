package com.oscarShop.steps;

import com.oscarShop.pages.ConfirmationPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class ConfirmationPageSteps implements En {
    ConfirmationPage confirmation;

    public ConfirmationPageSteps() {
        Then("Confirmation page with the item displayed",() ->{
            confirmation = page(ConfirmationPage.class);
            confirmation.itemDisplayed().should(exist);
        });
    }
}
