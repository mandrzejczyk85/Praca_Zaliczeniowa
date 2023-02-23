package MyStore.A_CreateAccount.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Log in to your customer account']/span")
    WebElement signIn;

    public void signInClick() {
        signIn.click();
    }

    @FindBy(xpath = "//a[@class='logout hidden-sm-down']")
    WebElement logOut;

    public void logout() {
        logOut.click();
    }
}