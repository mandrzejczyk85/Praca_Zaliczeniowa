package MyStore.B_AddFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {

    public AddressesPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='address-body']/h4")
    WebElement alias;
    @FindBy(xpath = "//section[@id='content']/div/article/div/address")
    WebElement data;
    @FindBy(xpath = "//a[@class='logout hidden-sm-down']")
    WebElement signOut;

    public String verifyCorrectAlias() {
        return alias.getText();
    }
    public String verifyCorrectAddAddress() {
        return data.getText();
    }
    public void logOut() {
        signOut.click();
    }
}
