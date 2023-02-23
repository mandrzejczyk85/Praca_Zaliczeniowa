package MyStore.D_DeleteFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St4_ClothesPage {
    public St4_ClothesPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='products row']/div[2]/article/div/div[2]/h2/a")
    WebElement hummingbirdPrintedSweater;

    public void choiceClothes() {
        hummingbirdPrintedSweater.click();
    }
}
