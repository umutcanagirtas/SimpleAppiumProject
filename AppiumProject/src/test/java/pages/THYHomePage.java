package pages;

import helpers.CustomElementWaits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class THYHomePage {
    private final AppiumDriver<MobileElement> appiumDriver;

    public THYHomePage(AppiumDriver<MobileElement> appiumDriver) {
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(id = "com.turkishairlines.mobile:id/acMain_btnBooking")
    private MobileElement bookAFlight;

    public MobileElement getBookAFlight() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver, bookAFlight);
        return bookAFlight;
    }

    public void setBookAFlight(MobileElement bookAFlight) {
        this.bookAFlight = bookAFlight;
    }

    public void clickBookAFlight() {
        getBookAFlight().click();
    }
}
