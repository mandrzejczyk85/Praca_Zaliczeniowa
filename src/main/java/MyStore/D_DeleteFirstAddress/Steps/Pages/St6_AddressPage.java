package MyStore.D_DeleteFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St6_AddressPage {
    public St6_AddressPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='js-address-form']/form/div/article/footer/a[2]")
    WebElement deleteBtn;
    @FindBy(xpath = "//div[@class='container']/div/div/a/img")
    WebElement homePage;

    public void deleteAddress() {
        deleteBtn.click();
    }
    public void goToHomePage() {
        homePage.click();
    }
}
