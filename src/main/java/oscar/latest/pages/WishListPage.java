package oscar.latest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.text.resources.ext.BreakIteratorResources_th;

import java.util.Collection;

public class WishListPage extends PageBase{
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Create a new wish list')]")
    WebElement createNWLButton;

    public WishListPage clickCreateNWLButton() {
        click(createNWLButton);
        return  new WishListPage(driver);
    }

    @FindBy(id = "id_name")
    WebElement wishListNameInput;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement saveButton;

    public WishListPage saveNameOfNewList(String wishListName) {
        type(wishListNameInput,wishListName);
        click(saveButton);
        return new WishListPage(driver);
    }

    @FindBy(css = "[class*=\"alertinner wicon\"]")
    WebElement confirmMessage;

    public String checkConfirmationMessage() {
        return confirmMessage.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'View')]")
    WebElement viewButton;
    

    public WishListPage clickvViewButton() {
        click(viewButton);
        return new WishListPage(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Books about Robots')]")
    WebElement wLName;

    public String getNameOfWishList() {
        return wLName.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'The Robot Novels')]")
    WebElement itemsName;

    public String getItemsNameFromWishList() {
        return itemsName.getText();
    }

    @FindBy(id = "id_lines-0-id")
    WebElement plusQuantity;

    @FindBy(xpath = "//button[contains(text(),'Update quantities')]")
    WebElement updateQuantityButton;

    public WishListPage updateQuantities() {
        click(plusQuantity);
        click(updateQuantityButton);
        return this;
    }

    public Object setAmmountTo0() {
    }
}
