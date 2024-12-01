package petSitter.tests_Cucumber.stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import petSitter.pages.HomePage;

import static petSitter.core.BasePage.driver;

public class HomePageSteps {

    @Given("Пользователь запускает браузер")
    public void userLaunchesBrowser(){
        new HomePage(driver).init("firefox");
    }


    @And("Пользователь закрывает браузер")
    public void userCloseBrowser() {
        new HomePage(driver).quitBrowser();
    }
}