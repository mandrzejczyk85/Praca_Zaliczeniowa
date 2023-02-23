package MyStore.B_AddFirstAddress.Steps;

import MyStore.B_AddFirstAddress.Steps.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Steps {

    WebDriver driver;
    String url = "https://mystore-testlab.coderslab.pl/index.php";

    @Given("Uzytkownik znajduje się na stronie glownej")
    public void setUp() {
        System.setProperty("webdriver.driver.chromedriver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }
    @When("Uzytkownik klika w opcje Sign In na gorze strony")
    public void signIn() {
        HomePage homePage = new HomePage(driver);
        homePage.signIn();
    }
    @And("^Uzytkownik wpisuje poprawny aders \"(.*)\" oraz \"(.*)\"$")
    public void logIn(String email, String pswd) {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.logIn(email, pswd);
    }
    @And("Uzytkownik klika w kafelek - ADD FIRST ADDRESS")
    public void addFirstAddressButton() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.addFirstAddressBtn();
    }
    @And("^Uzytkownik wypelnia dane adresowe jak \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\",\"(.*)\" oraz \"(.*)\"$")
    public void fillAddNewAddress(String alias,String imie,String nazwisko,String adres,String miasto,String kodPocztowy,String kraj,String telefon) {
        AddNewAddressPage addNewAddressPage = new AddNewAddressPage(driver);
        addNewAddressPage.fillNewAddress(alias,imie,nazwisko,adres,miasto,kodPocztowy,kraj,telefon);
    }
    @Then("^Uzytkownik sprawdza poprawnosc danych adresowych \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
    public void verifyCorrectAddAddress(String alias,String imie,String nazwisko,String adres,String miasto,String kodPocztowy,String kraj,String telefon) {
        AddressesPage addressesPage = new AddressesPage(driver);
        Assert.assertEquals(addressesPage.verifyCorrectAlias(), alias);
        Assert.assertEquals(addressesPage.verifyCorrectAddAddress(), imie +" "+ nazwisko +"\n"+ adres+"\n"+miasto+"\n"+kodPocztowy +"\n"+ kraj +"\n"+ telefon);
    }
    @And("Uzytkownik wylogowuje sie i zamyka przegladarke")
    public void tearDown() {
        AddressesPage addressesPage = new AddressesPage(driver);
        addressesPage.logOut();
        driver.quit();
    }
}
