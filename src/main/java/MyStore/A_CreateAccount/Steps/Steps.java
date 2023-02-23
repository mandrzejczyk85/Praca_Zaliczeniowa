package MyStore.A_CreateAccount.Steps;

import MyStore.A_CreateAccount.Steps.Pages.HomePage;
import MyStore.A_CreateAccount.Steps.Pages.FillYourPersonalDataPage;
import MyStore.A_CreateAccount.Steps.Pages.LogInToYourAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Steps {
    WebDriver driver;
    String url = "https://mystore-testlab.coderslab.pl/index.php";

    @Given("Uzytkownik znajduje się na glownej stronie")
    public void HomePage() {
        System.setProperty("webdriver.driver.chromedriver","src/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }
    @And("Uzytkownik klika w opcję Sign In w gornej czesci strony")
    public void homePage() {
        HomePage homePage = new HomePage(driver);
        homePage.signInClick();
    }
    @And("Uzytkownik klika w - No account? Create one here - poniżej przycisku Sign In")
    public void createNewAccount() {
        LogInToYourAccountPage log = new LogInToYourAccountPage(driver);
        log.createNewAccount();
    }
    @Then("^Uzytkownik uzupelnia dane do rejestracji konta \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" i klika przycisk Save$")
    public void fillPersonalData(String imie,String nazwisko,String email,String haslo) throws InterruptedException {
        FillYourPersonalDataPage fillYourPersonalData = new FillYourPersonalDataPage(driver);
        fillYourPersonalData.yourPersonalData(imie,nazwisko,email,haslo);
    }
    @And("Uzytkownik wylogowuje sie i zamyka chrome")
    public void tearDown() {
        HomePage homePage = new HomePage(driver);
        homePage.logout();
        driver.quit();
    }
}
