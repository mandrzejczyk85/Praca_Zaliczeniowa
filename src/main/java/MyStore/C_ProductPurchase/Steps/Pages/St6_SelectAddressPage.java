package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St6_SelectAddressPage {
    public St6_SelectAddressPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//form[@method='POST']/div[2]/button")
    WebElement continueBtn;
    @FindBy(xpath = "//article[@class='js-address-item address-item selected']/header/label/span/span")
    WebElement firstAddress;

    public void selectAddress() {
        firstAddress.click();
        continueBtn.click();
    }
}
