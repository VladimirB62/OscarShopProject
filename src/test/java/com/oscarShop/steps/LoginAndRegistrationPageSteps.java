package com.oscarShop.steps;

import com.oscarShop.pages.LoginAndRegistrationPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class LoginAndRegistrationPageSteps implements En {

    LoginAndRegistrationPage login;

    public LoginAndRegistrationPageSteps() {
        Then("Login or register page displayed",() ->{
            login = page(LoginAndRegistrationPage.class);
            login.registerFormDisplayed().should(exist);
        });

        When("Enter the valid credentials and confirm password",() ->{
            login.validRegistrationInput();
        });

        And("Click Register button",() ->{
            login.clickOnRegisterButton();
        });

        When("Enter the valid login credentials",() ->{
            login.validLoginInput();
        });

        And("Click Log in button",() ->{
            login.clickOnLogInButton();
        });
    }
}
