package com.oscarShop.steps;

import com.oscarShop.pages.PaymentPage;
import com.oscarShop.pages.ProductsPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.Wait;
import static com.codeborne.selenide.Selenide.page;

public class PaymentPageSteps implements En {
    PaymentPage payment;

    public PaymentPageSteps() {
        Then("Payment page displayed",() ->{
            payment = page(PaymentPage.class);
            payment.paymentPageNameDisplayed().shouldHave(text("Enter payment details"));
        });

        When("Click on Continue button1",() ->{
            payment.clickOnContinueButton2();
        });
    }
}
