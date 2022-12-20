package latestVersionTests;

import com.beust.ah.A;
import oscar.latest.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishListPageTests extends ProfilePageTests{

    @BeforeMethod
    public void preconditions() {
        new ProfilePage(driver).clickWishListLink();
    }

    @Test//2.3.5.1
    public void createNewWishlist() {
        new WishListPage(driver).clickCreateNWLButton();
        new WishListPage(driver).saveNameOfNewList("Books about Robots");
        Assert.assertTrue(new WishListPage(driver).checkConfirmationMessage().contains("has been created"));
    }

    @Test//2.3.5.2
    public void viewWishList() {
        new WishListPage(driver).clickvViewButton();
        Assert.assertEquals(new WishListPage(driver).getNameOfWishList(), "Books about Robots");
    }

    @Test//2.3.5.2.1
    public void addProductToWishlist() {
        new HeaderPage(driver).goToItems("robot");
        new ProductsPage(driver).clickItem();
        String itemsName = new ItemPage(driver).getItemsName();
        new ItemPage(driver).addItemToWishList();
        new ItemPage(driver).goToWishList();
        Assert.assertEquals(new WishListPage(driver).getItemsNameFromWishList(), itemsName);
    }

    @Test//2.3.5.2.2
    public void changeAmmount() {
        new WishListPage(driver).updateQuantities();
        Assert.assertEquals(new WishListPage(driver).checkConfirmationMessage(), "Quantities updated.");
    }

    @Test//2.3.5.2.2.1
    public void deleteItemByReducing() {
        new WishListPage(driver).setAmmountTo0()
                .clickUpdateQuantities();
        Assert.assertEquals(new WishListPage(driver).listIsEmpty(), "is empty");

    }

    @Test//2.3.5.2.2.2
    public void deleteItem() {
        new WishListPage(driver).clickvViewButton();
        new WishListPage(driver).choosRemoveOption()
                .clickRemoveButton();
        Assert.assertEquals(new WishListPage(driver).checkConfirmationMessage(), "was removed from");
    }

    @Test//2.3.5.3
    public void deleteWishList() {
        new WishListPage(driver).chooseDeleteOptoin("delete");
        new WishListPage(driver).clickDeleteButton();
        Assert.assertEquals(new WishListPage(driver).checkConfirmationMessage(), "wish list has been deleted");
    }

    @Test//2.3.5.4
    public void renameWishList() {
        new WishListPage(driver).chooseWishListSettings();
        new WishListPage(driver).saveNameOfNewList("T-shirts");
        Assert.assertTrue(new WishListPage(driver).checkConfirmationMessage().contains("has been updated"));
    }

    @Test//2.3.6
    public void logout() {
        new WishListPage(driver).clickLogotIcon();
        Assert.assertTrue(new WishListPage(driver).loginLinkIsPresent());
    }

}
