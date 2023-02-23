package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St1_HomePage {
    public St1_HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signIn;

    public void signInClick() {
        signIn.click();
    }
}
