import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import constants.Constant;
import helpers.CustomElementWaits;
import helpers.dataPicker.DatePicker;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import pages.FlightOptionsPage;
import pages.ListOfFlightsPage;
import pages.SearchAreaPage;
import pages.THYHomePage;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepImplementation extends BaseTest {
    THYHomePage thyHomePage;
    ListOfFlightsPage listOfFlightsPage;
    SearchAreaPage searchAreaPage;
    FlightOptionsPage flightOptionsPage;

    @BeforeScenario
    public void beforeScenario() throws MalformedURLException {
        super.beforeScenario();
        thyHomePage = new THYHomePage(appiumDriver);
        flightOptionsPage = new FlightOptionsPage(appiumDriver);
        listOfFlightsPage = new ListOfFlightsPage(appiumDriver);
        searchAreaPage = new SearchAreaPage(appiumDriver);
    }

    @AfterScenario
    public void afterScenario() {
        super.afterScenario();
    }

    @Step("Pop up Region")
    public void acceptCookiesDenyButtonAttentionClick() {
        appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //region Pop up Region
        //click deny button
        CustomElementWaits.waitUntilElementToClickable(appiumDriver, appiumDriver.findElementById(Constant.firstDenyButton));
        appiumDriver.findElementById(Constant.firstDenyButton).click();
        //click accept cookies button
        CustomElementWaits.waitUntilElementToClickable(appiumDriver, appiumDriver.findElementById(Constant.acceptCookiesButton));
        appiumDriver.findElementById(Constant.acceptCookiesButton).click();
        //click attention button
        CustomElementWaits.waitUntilElementToClickable(appiumDriver, appiumDriver.findElementById(Constant.attentionButton));
        appiumDriver.findElementById(Constant.attentionButton).click();
        //endregion
    }

    @Step("Book A Flight Page")
    public void clickBookAFlight() {
        thyHomePage.clickBookAFlight();
    }

    @Step("Click One Way Option")
    public void clickOneWay() {
        flightOptionsPage.clickOneWayOption();
    }

    @Step("Select From Option")
    public void clickFrom() {
        flightOptionsPage.clickFromOption();
        //region Pop up
        //click deny
        CustomElementWaits.waitUntilElementToClickable(appiumDriver, appiumDriver.findElementById(Constant.secondDenyButton));
        appiumDriver.findElementById(Constant.secondDenyButton).click();
        //endregion
    }

    @Step("Search <item> And Select Them For From Option")
    public void clickSearchAreaAndSendKeysItemAndSelectItemToSaw(String saw) {
        searchAreaPage.searchItemAndSelectThem(saw);
    }

    @Step("Select To Option")
    public void clickTo() {
        flightOptionsPage.clickToOption();
    }

    @Step("Search <item> And Select Them For To Option")
    public void clickSearchAreaAndSendKeysItemAndSelectItemToEsb(String esb) {
        searchAreaPage.searchItemAndSelectThem(esb);
    }

    @Step("Pick A Day For The Flight")
    public void clickCalendarToPickADay() {
        try{
            DatePicker.clickCalendarToPickADay(appiumDriver,flightOptionsPage);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Step("Add An Adult For The Flight")
    public void clickAddAnAdult() {
        flightOptionsPage.getAddAnAdult().click();
    }

    @Step("Search A Flight With Your Selections")
    public void clickSearchAFlight() {
        flightOptionsPage.clickContinueButton();
    }

    @Step("Select First List To Flight's List")
    public void clickFirstFlight() {
        listOfFlightsPage.clickFirstFlight();
    }

    @Step("Select Eco Flight")
    public void clickEcoFlight() {
        listOfFlightsPage.clickEcoFlight();
    }

    @Step("And Click Continue")
    public void clickContinue() {
        listOfFlightsPage.clickContinueFlightButton();
    }

}
