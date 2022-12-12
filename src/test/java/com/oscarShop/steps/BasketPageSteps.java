package com.oscarShop.steps;

import com.oscarShop.pages.BasketPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class BasketPageSteps implements En {
    BasketPage basket;

    public BasketPageSteps() {
        Then("Basket page displayed",() ->{
            basket = page(BasketPage.class);
            basket.nameBasketDisplayed().should(exist);
        });

        When("Click on Proceed to checkout button",() ->{
            basket.clickProceedToCheckout();
        });
    }
}
