package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St10_OrderHistoryAndDetails {
    public St10_OrderHistoryAndDetails(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@id='content']/table/tbody/tr/th")
    WebElement orderRef;
    @FindBy(xpath = "//section[@id='content']/table/tbody/tr[1]/td[2]")
    WebElement orderPrice;

    public String orderReference() {
        return orderRef.getText();
    }
    public String orderPricePlace() {
        return orderPrice.getText();
    }
}
