package oscar.latest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage extends PageBase{


    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@name='language']")
    WebElement selectLang;

    @FindBy(css = ".btn:nth-child(4)")
    WebElement goLocator;

    public void selectLanguage(String lang) {
        Select langSelect = new Select(selectLang);
        langSelect.selectByValue(lang);
        click(goLocator);
    }

    @FindBy(css = "#login_link" )
    WebElement loginLink;

    public void clickOnLoginOrRegisterButton() {
        click(loginLink);
    }

    @FindBy(css = "[class*=\"far fa-user mr-2\"]")
    WebElement accountSign;

    public HeaderPage verifySuccessfullRegistration() {
        Assert.assertTrue(accountSign.isDisplayed());
        return this;
    }

    @FindBy(id = "logout_link")
    WebElement logoutLink;

    public HeaderPage logout() {
        click(logoutLink);
        return new HeaderPage(driver);
    }

    @FindBy(css = "[class*=\"nav-link mt-2 mt-lg-0\"]")
    WebElement accountButton;

    public ProfilePage clickAccountButton() {
        click(accountButton);
        return new ProfilePage(driver);
    }

    @FindBy(css = "[class*=\"form-control mr-sm-2\"]")
    WebElement searchInput;

    public ProductsPage goToItems(String searchName) {
        type(searchInput,searchName);
        return new ProductsPage(driver);
    }
}
