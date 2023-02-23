package MyStore.D_DeleteFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St7_ShopingCartPage {
    public St7_ShopingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@id='main']/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[3]/div/a")
    WebElement trash;
    public void deleteAddress() {
        trash.click();
    }

}

