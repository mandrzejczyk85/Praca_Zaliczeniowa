package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St9_OrderConfirmedPage {
    public St9_OrderConfirmedPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='order-details']/ul/li")
    WebElement orderReference;
    @FindBy(xpath = "//div[@id='order-items']/div/table/tbody/tr[3]/td[2]")
    WebElement orderTotalPrice;

    public String orderRefNumb() {
        System.out.println("Kod zamówienia: \t"+orderReference.getText().substring(17));
        return orderReference.getText().substring(17);
    }
    public String orderTotalPrice() {
        System.out.println("Kwota zamówienia: \t" + orderTotalPrice.getText());
        return orderTotalPrice.getText();
    }
}
