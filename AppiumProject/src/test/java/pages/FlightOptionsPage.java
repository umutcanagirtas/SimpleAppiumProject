package pages;

import helpers.CustomElementWaits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FlightOptionsPage {
    private final AppiumDriver<MobileElement> appiumDriver;
    public FlightOptionsPage(AppiumDriver<MobileElement> appiumDriver){
        this.appiumDriver=appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }
    @AndroidFindBy(id = "com.turkishairlines.mobile:id/frDashboard_tvOneWay")
    private MobileElement oneWayOption;
    @AndroidFindBy(id = "com.turkishairlines.mobile:id/frDashboard_llFrom")
    private MobileElement fromOption;
    @AndroidFindBy(id = "com.turkishairlines.mobile:id/frDashboard_llTo")
    private MobileElement toOption;
    @AndroidFindBy(id = "com.turkishairlines.mobile:id/frDashboard_rlDeparture")
    private MobileElement calendar;
    @AndroidFindBy(id = "com.turkishairlines.mobile:id/frDashboard_btnSearch")
    private MobileElement continueButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView")
    private MobileElement addAnAdult;

    public MobileElement getAddAnAdult() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,addAnAdult);
        return addAnAdult;
    }

    public void setAddAnAdult(MobileElement addAnAdult) {
        this.addAnAdult = addAnAdult;
    }

    public MobileElement getOneWayOption() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,oneWayOption);
        return oneWayOption;
    }

    public void setOneWayOption(MobileElement oneWayOption) {
        this.oneWayOption = oneWayOption;
    }

    public MobileElement getFromOption() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,fromOption);
        return fromOption;
    }

    public void setFromOption(MobileElement fromOption) {
        this.fromOption = fromOption;
    }

    public MobileElement getToOption() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,toOption);
        return toOption;
    }

    public void setToOption(MobileElement toOption) {
        this.toOption = toOption;
    }

    public MobileElement getCalendar() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,calendar);
        return calendar;
    }

    public void setCalendar(MobileElement calendar) {
        this.calendar = calendar;
    }

    public MobileElement getContinueButton() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,continueButton);
        return continueButton;
    }

    public void setContinueButton(MobileElement continueButton) {
        this.continueButton = continueButton;
    }

    public void clickOneWayOption(){
        getOneWayOption().click();
    }
    public void clickFromOption(){
        getFromOption().click();
    }
    public void clickToOption(){
        getToOption().click();
    }
    public void clickCalendar(){
        getCalendar().click();
    }
    public void clickContinueButton(){
        getContinueButton().click();
    }
}
