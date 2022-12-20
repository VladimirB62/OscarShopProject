package oscar.latest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class ItemPage extends PageBase{
    public ItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    WebElement itemsName;
    public String getItemsName() {
        return itemsName.getText();
    }

    @FindBy(css = "//a[contains(text(),'Add to wish list')]")
    WebElement addToWishListButton;

    @FindBy(xpath = "//a[contains(text(),\"Add to 'Books about Robots' wish list\")]")
    WebElement addTo;

    public ItemPage addItemToWishList() {
        click(addToWishListButton);
        pause(1000);
        click(addTo);
        return new ItemPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),\"'Books about Robots'\")]")
    WebElement wishListLink;

    public WishListPage goToWishList() {
        click(wishListLink);
        return new WishListPage(driver);
    }
}
