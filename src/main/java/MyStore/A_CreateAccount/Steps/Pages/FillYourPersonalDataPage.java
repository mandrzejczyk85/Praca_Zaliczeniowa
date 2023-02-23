package MyStore.A_CreateAccount.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillYourPersonalDataPage {
    public FillYourPersonalDataPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='field-id_gender-1']")
    WebElement genderMale;
    @FindBy(xpath = "//input[@id='field-id_gender-2']")
    WebElement genderFemale;
    @FindBy(xpath = "//input[@id='field-firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='field-lastname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='field-email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='field-password']")
    WebElement pswd;
    @FindBy(xpath = "//button[@class='btn btn-primary form-control-submit float-xs-right']")
    WebElement save;

    public void yourPersonalData(String imie,String nazwisko,String email,String haslo) {
        firstName.sendKeys(imie);
        lastName.sendKeys(nazwisko);
        this.email.sendKeys(email);
        pswd.sendKeys(haslo);
        if (imie.endsWith("a")) {
            genderFemale.click();
        } else {
            genderMale.click();
        }
        save.click();
    }
}
