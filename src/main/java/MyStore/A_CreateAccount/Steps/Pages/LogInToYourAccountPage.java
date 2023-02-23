package MyStore.A_CreateAccount.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInToYourAccountPage {
    public LogInToYourAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='no-account']/a")
    WebElement create;

    public void createNewAccount() {
        create.click();
    }
}
