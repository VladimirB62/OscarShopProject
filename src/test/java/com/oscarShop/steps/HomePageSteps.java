package com.oscarShop.steps;

import com.oscarShop.pages.HomePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static com.oscarShop.pages.HomePage.baseURL;

public class HomePageSteps implements En {

    HomePage home;

    public HomePageSteps(){
        Given("Navigate to Home Page",() -> {
            //System.setProperty("selenide.browser", "Firefox");
            home = open(baseURL,HomePage.class);
            home.chooseEnglish();
        });

        When("Click on Login or register button",() ->{
            home.clickOnLoginOrRegisterButton();
        });

        Then("Logout button displayed",() ->{
            home.logoutButtonDisplayed().should(exist);
        });

        When("Click on Logout button",() ->{
            home.clickOnLogoutButton();
        });

        Then("Login or register button displayed",() ->{
            home.loginOrRegisterButtonDisplayed().should(exist);
        });

        When("Click on All products link",() ->{
            home.clickOnAllProductsLink();
        });
    }

}
