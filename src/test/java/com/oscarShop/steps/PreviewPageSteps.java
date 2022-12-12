package com.oscarShop.steps;

import com.oscarShop.pages.PreviewPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class PreviewPageSteps implements En {
    PreviewPage preview;

    public PreviewPageSteps() {

        Then("Preview order page displayed",() ->{
            preview = page(PreviewPage.class);
            preview.previewNameDisplayed().should(exist);
        });

        When("Click on Place order button",() ->{
            preview.clickOnPlaceOrderButton();
        });
    }
}
