package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St7_ShippingMethodPage {
    public St7_ShippingMethodPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='row delivery-option js-delivery-option']/div/span/span")
    WebElement inStore;
    @FindBy(xpath = "//form[@class='clearfix']/button")
    WebElement continueBtn;

    public void continueBtnClick() {
        inStore.click();
        continueBtn.click();
    }
}
