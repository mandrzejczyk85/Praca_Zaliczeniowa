package MyStore.B_AddFirstAddress.Steps.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage {
    public AddNewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='field-alias']")
    WebElement alias;
    @FindBy(xpath = "//input[@id='field-firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='field-lastname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='field-address1']")
    WebElement address;
    @FindBy(xpath = "//input[@id='field-city']")
    WebElement city;
    @FindBy(xpath = "//input[@id='field-postcode']")
    WebElement zipPostalCode;
    @FindBy(xpath = "//select[@id='field-id_country']")
    WebElement country;
    @FindBy(xpath = "//input[@id='field-phone']")
    WebElement phone;
    @FindBy(xpath = "//footer/button[@type='submit']")
    WebElement submit;

    public void fillNewAddress(String alias,String imie,String nazwisko,String adres,String miasto, String kodPocztowy, String kraj,String telefon) {
        this.alias.sendKeys(alias);
        this.firstName.clear();
        this.firstName.sendKeys(imie);
        this.lastName.clear();
        this.lastName.sendKeys(nazwisko);
        this.address.sendKeys(adres);
        this.city.sendKeys(miasto);
        this.zipPostalCode.sendKeys(kodPocztowy);
        Select country = new Select(this.country);
        country.selectByVisibleText(kraj);
        this.phone.sendKeys(telefon);
        this.submit.click();
    }
}
