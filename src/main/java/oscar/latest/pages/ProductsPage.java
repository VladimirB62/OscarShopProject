package oscar.latest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath= "//a[contains(text(),'The Robot Novels')]")
    WebElement itemsName;

    public ItemPage clickItem() {
        click(itemsName);
        return new ItemPage(driver);
    }
}
