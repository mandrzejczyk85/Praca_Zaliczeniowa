package MyStore.D_DeleteFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St3_YourAccountPage {
    public St3_YourAccountPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[@id='category-3']/a")
    WebElement clothes;
    public void clickClothes() {
        clothes.click();
    }
}
