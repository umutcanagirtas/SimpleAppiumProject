package pages;

import helpers.CustomElementWaits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ListOfFlightsPage {
    private final AppiumDriver<MobileElement> appiumDriver;

    public ListOfFlightsPage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup")
    private MobileElement firstFlight;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup")
    private MobileElement ecoFlight;
    @AndroidFindBy(id = "com.turkishairlines.mobile:id/frFlightSearch_btnContinue")
    private MobileElement continueFlight;

    public MobileElement getFirstFlight() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,firstFlight);
        return firstFlight;
    }

    public void setFirstFlight(MobileElement firstFlight) {
        this.firstFlight = firstFlight;
    }

    public MobileElement getEcoFlight() {
        CustomElementWaits.waitUntilElementFind(appiumDriver,ecoFlight);
        return ecoFlight;
    }

    public void setEcoFlight(MobileElement ecoFlight) {
        this.ecoFlight = ecoFlight;
    }

    public MobileElement getContinueFlight() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,continueFlight);
        return continueFlight;
    }

    public void setContinueFlight(MobileElement continueFlight) {
        this.continueFlight = continueFlight;
    }
    public void clickFirstFlight(){
        getFirstFlight().click();
    }
    public void clickEcoFlight(){
        getEcoFlight().click();
    }
    public void clickContinueFlightButton(){
       getContinueFlight().click();
    }
}
