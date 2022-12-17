package oscar.latest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class*=\"alertinner wicon\"]")
    WebElement deletionMessage;

    public String checkSuccessfullDeletionMessage() {
        return deletionMessage.getText();
    }
}
