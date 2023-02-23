package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St3_YourAccountPage {
    public St3_YourAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    // Clothes Choice ---------------------------------
    @FindBy(xpath = "//li[@id='category-3']/a")
    WebElement clothes;
    public void clickClothes() {
        clothes.click();
    }

    // Back to Account Page ----------------------------
    @FindBy(xpath = "//a[@class='account']/span")
    WebElement myAccount;
    public void myAccountClick() {
        myAccount.click();
    }

    // Enter to Order History And Details --------------
    @FindBy(xpath = "//section[@id='content']/div/div/a[3]/span")
    WebElement orderHistoryAndDetails;
    public void ordHistAndDetPlace() {
        orderHistoryAndDetails.click();
    }

    // LogOut -------------------------------------------
    @FindBy(xpath = "//div[@id=\"_desktop_user_info\"]/div/a[1]")
    WebElement signOut;
    public void logOut() {
    signOut.click();
    }
}