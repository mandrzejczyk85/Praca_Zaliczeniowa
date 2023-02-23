package MyStore.C_ProductPurchase.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class St5_SweaterPage {
    public St5_SweaterPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='current-price']/span[2]")
    WebElement discount;
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement size;
    @FindBy(xpath = "//button[@class='btn btn-touchspin js-touchspin bootstrap-touchspin-up']")
    WebElement quantity;
    @FindBy(xpath = "//button[@class='btn btn-primary add-to-cart']")
    WebElement addToCart;
    @FindBy(xpath = "//div[@class='cart-content-btn']/a")
    WebElement proceedToCheckout;
    @FindBy(xpath = "//div[@class='card cart-summary']/div[2]/div/a")
    WebElement proceedToCheckoutTwo;

    public String discount() {
        return discount.getText();
    }
    public void sizeAndQuantity(String rozmiar,int ilosc) throws InterruptedException {
        Select size = new Select(this.size);
        size.selectByVisibleText(rozmiar);
        Thread.sleep(200);
        for (int i = 1; i < ilosc; i++) {
            quantity.click();
        }
        addToCart.click();
    }

    public void proceed() {
        proceedToCheckout.click();
        proceedToCheckoutTwo.click();
    }
}
