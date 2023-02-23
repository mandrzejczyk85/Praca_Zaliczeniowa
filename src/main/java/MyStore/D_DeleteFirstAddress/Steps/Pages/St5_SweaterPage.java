package MyStore.D_DeleteFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St5_SweaterPage {
    public St5_SweaterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary add-to-cart']")
    WebElement addToCart;
    @FindBy(xpath = "//div[@class='cart-content-btn']/a")
    WebElement proceedToCheckout;
    @FindBy(xpath = "//div[@class='card cart-summary']/div[2]/div/a")
    WebElement proceedToCheckoutTwo;

    public void proceed() {
        addToCart.click();
        proceedToCheckout.click();
        proceedToCheckoutTwo.click();
    }
}
