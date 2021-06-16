package pages;

import helpers.CustomElementWaits;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SearchAreaPage {
    private final AppiumDriver<MobileElement> appiumDriver;
    public SearchAreaPage(AppiumDriver<MobileElement> appiumDriver){
        this.appiumDriver=appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }
    @AndroidFindBy(id = "com.turkishairlines.mobile:id/frAirportSelection_etSearch")
    private MobileElement searchArea;

    public MobileElement getSearchArea() {
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,searchArea);
        return searchArea;
    }

    public void setSearchArea(MobileElement searchArea) {
        this.searchArea = searchArea;
    }
    public void searchItemAndSelectThem(String saw){
        getSearchArea().sendKeys(saw);
        CustomElementWaits.waitUntilElementToClickable(appiumDriver,appiumDriver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]"
        ));
        appiumDriver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]"
        ).click();
    }
}
