package com.oscarShop.steps;

import com.oscarShop.pages.ProductsPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.page;

public class ProductsPageSteps implements En {

    ProductsPage products;

    public ProductsPageSteps() {
        Then("All products page displayed",() ->{
            products = page(ProductsPage.class);
            products.productsPageNameDisplayed().should(exist);
        });

        When("Click on first item's Add to basket button",() ->{
            products.clickAddToBasket();
        });

        And("Click on View basket button",() ->{
            products.clickOnViewBasketButton();
        });
    }
}
