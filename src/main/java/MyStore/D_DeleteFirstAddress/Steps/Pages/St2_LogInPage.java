package MyStore.D_DeleteFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class St2_LogInPage {
    public St2_LogInPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='field-email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='field-password']")
    WebElement pswd;
    @FindBy(xpath = "//button[@id='submit-login']")
    WebElement signIn;

    public void login(String email, String pswd) {
        this.email.sendKeys(email);
        this.pswd.sendKeys(pswd);
        signIn.click();
    }
}
