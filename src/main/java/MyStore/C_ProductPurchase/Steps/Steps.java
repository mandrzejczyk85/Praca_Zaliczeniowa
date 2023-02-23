package MyStore.C_ProductPurchase.Steps;

import MyStore.C_ProductPurchase.Steps.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Steps {

    public WebDriver driver;
    String url = "https://mystore-testlab.coderslab.pl/index.php";

    @Given("Uzytkownik znajduje sie na glownej stronie")
    public void SetUp() {
        System.setProperty("webdriver.driver.chromedriver","src/main/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }
    @When("Uzytkownik klika w opcje Sign In w gornej czesci strony")
    public void homePage() {
        St1_HomePage homePage = new St1_HomePage(driver);
        homePage.signInClick();
    }
    @And("^Uzytkownik loguje sie do utworzonego wczesniej konta \"(.*)\", \"(.*)\"$")
    public void logIn(String email, String pswd) {
        St2_LogInPage logInPage = new St2_LogInPage(driver);
        logInPage.login(email, pswd);
    }
    @And("Uzytkownik przechodzi do dzialu z ubraniami")
    public void clothes() {
        St3_YourAccountPage yourAccountPage = new St3_YourAccountPage(driver);
        yourAccountPage.clickClothes();
    }
    @And("Uzytkownik wybiera produkt HUMMINGBIRD PRINTED SWEATER")
    public void clothesChoice() {
        St4_ClothesPage clothesPage = new St4_ClothesPage(driver);
        clothesPage.choiceClothes();
    }
    @And("^Uzytkownik wybiera \"(.*)\" i \"(.*)\" koszulek, sprawdza czy widnieje \"(.*)\" 20% oraz dodaje do koszyka i przechodzi do kasy$")
    public void choiceSizeAndQuantity(String rozmiar,int ilosc, String rabat) throws InterruptedException {
        St5_SweaterPage sweaterPage = new St5_SweaterPage(driver);
        Assert.assertEquals(sweaterPage.discount(), rabat);
        sweaterPage.sizeAndQuantity(rozmiar, ilosc);
        sweaterPage.proceed();
    }
    @And("Uzytkownik potwierdza adres wysylki")
    public void choiceShipping() {
        St6_SelectAddressPage selectAddressPage = new St6_SelectAddressPage(driver);
        selectAddressPage.selectAddress();
    }
    @And("Uzytkownik wybiera metode dostawy")
    public void shippingMethod() {
        St7_ShippingMethodPage st8ShippingMethodPage = new St7_ShippingMethodPage(driver);
        st8ShippingMethodPage.continueBtnClick();
    }
    @And("Uzytkownik wybiera opcje zaplaty, potwierdza zapoznanie sie z regulaminem i sklada zamowienie")
    public void orderConfirmation() {
        St8_PaymentPage st8PaymentPage = new St8_PaymentPage(driver);
        st8PaymentPage.placeOrder();
    }
    @Then("Uzytkownik przechodzi do zakladki ORDER HISTORY AND DETAILS w zakladce Your account i sprawdza czy jego zamówienie znajduje się w historii zamówien")
    public void checkOrderConfirmationInOrderHistory() {
        St9_OrderConfirmedPage st9OrderConfirmedPage = new St9_OrderConfirmedPage(driver);

        String orderCode = st9OrderConfirmedPage.orderRefNumb();
        String orderPrice = st9OrderConfirmedPage.orderTotalPrice();

        St3_YourAccountPage st3YourAccountPage = new St3_YourAccountPage(driver);
        st3YourAccountPage.myAccountClick();
        st3YourAccountPage.ordHistAndDetPlace();
        St10_OrderHistoryAndDetails st10OrderHistoryAndDetails = new St10_OrderHistoryAndDetails(driver);

        Assert.assertEquals(st10OrderHistoryAndDetails.orderReference(),orderCode);
        Assert.assertEquals(st10OrderHistoryAndDetails.orderPricePlace(),orderPrice);
    }
    @And("Uzytkownik wylogowuje sie Sign out i zamyka przegladarke")
    public void tearDown() {
        St3_YourAccountPage st3YourAccountPage = new St3_YourAccountPage(driver);
        st3YourAccountPage.logOut();
        this.driver.quit();
    }
}
