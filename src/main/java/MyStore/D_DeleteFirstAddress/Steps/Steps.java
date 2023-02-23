package MyStore.D_DeleteFirstAddress.Steps;

import MyStore.D_DeleteFirstAddress.Steps.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Steps {

    WebDriver driver;
    String url = "https://mystore-testlab.coderslab.pl/index.php";

    @Given("Uzytkownik znajduje sie na stronie glownej")
    public void setUp() {
        System.setProperty("webdriver.driver.chromedriver","src/main/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }
    @When("Uzytkownik klika w opcje Sign In w górnej czesci strony")
    public void signIn() {
        St1_HomePage st1HomePage = new St1_HomePage(driver);
        st1HomePage.signInClick();
    }
    @And("^Uzytkownik loguje się do utworzonego wczesniej konta \"(.*)\", \"(.*)\"$")
    public void logIn(String email,String pswd) {
        St2_LogInPage st2LogInPage = new St2_LogInPage(driver);
        st2LogInPage.login(email, pswd);
    }
    @And("Uzytkownik przechodzi do dzialu z ubraniami Clothes")
    public void clickClothesPage() {
        St3_YourAccountPage st3YourAccountPage = new St3_YourAccountPage(driver);
        st3YourAccountPage.clickClothes();
    }
    @And("Uzytkownik wybiera produkt np HUMMINGBIRD PRINTED SWEATER")
    public void choiceClothes() {
        St4_ClothesPage st4ClothesPage = new St4_ClothesPage(driver);
        st4ClothesPage.choiceClothes();
    }
    @And("Uzytkownik wybiera domyślny rozmiar oraz ilosc i przechodzi do kasy")
    public void proceedToCheck() {
        St5_SweaterPage sweaterPage = new St5_SweaterPage(driver);
        sweaterPage.proceed();
    }
    @Then("Uzytkownik przechodzi do strony wyboru adresu, tam go usuwa klikajac delete i przechodzi do strony glownej klikajac w lewym gornym rogu logo MY STORE")
    public void deleteAddress() {
        St6_AddressPage st6AddressPage = new St6_AddressPage(driver);
        st6AddressPage.deleteAddress();
        st6AddressPage.goToHomePage();
    }
    @And("Uzytkownik przechodzi do koszyka z zakupami")
    public void cart() {
        St1_HomePage st1HomePage = new St1_HomePage(driver);
        st1HomePage.goToCart();
    }
    @And("Uzytkownik usuwa zakupy z koszyka, wylogowuje sie i zamyka przegladarke")
    public void removePurchases() throws InterruptedException {
        St7_ShopingCartPage st7ShopingCartPage = new St7_ShopingCartPage(driver);
        st7ShopingCartPage.deleteAddress();
        this.driver.quit();
    }

}
