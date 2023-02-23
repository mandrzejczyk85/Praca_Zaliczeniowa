package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St8_PaymentPage {
    public St8_PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='payment-options ']/div/div/span/input")
    WebElement payByCheck;
    @FindBy(xpath = "//form[@id='conditions-to-approve']/ul/li/div/span/input")
    WebElement agree;
    @FindBy(xpath = "//div[@id='payment-confirmation']/div/button")
    WebElement placeOrderBtn;

    public void placeOrder() {
        payByCheck.click();
        agree.click();
        placeOrderBtn.click();
    }
}
