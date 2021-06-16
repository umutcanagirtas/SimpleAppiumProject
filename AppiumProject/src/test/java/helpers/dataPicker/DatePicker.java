package helpers.dataPicker;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import pages.FlightOptionsPage;

import java.util.List;

public class DatePicker {

    public static void clickCalendarToPickADay(AppiumDriver<MobileElement> appiumDriver, FlightOptionsPage flightOptionsPage) {
        String date=appiumDriver.findElementById("com.turkishairlines.mobile:id/dateWidget_tvDateDay").getAttribute("text");
        int dateTime=Integer.parseInt(date);
        flightOptionsPage.clickCalendar();
        if(dateTime>=30){
            int i=1;
            List<MobileElement> elements =appiumDriver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.view.ViewGroup//android.widget.FrameLayout//android.widget.TextView"));
            for (MobileElement element : elements) {
                String text= element.getText();
                int textToInt=Integer.parseInt(text);
                if(i==textToInt){
                    element.click();
                    break;
                }
            }
        }else{
            int i=dateTime+1;
            List<MobileElement> elements =appiumDriver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup//android.widget.FrameLayout//android.widget.TextView"));
            for (MobileElement element : elements) {
                String text= element.getText();
                int textToInt=Integer.parseInt(text);
                if(i==textToInt){
                    element.click();
                    break;
                }
            }
        }
        MobileElement el18 = appiumDriver.findElementById("com.turkishairlines.mobile:id/frDashboard_btnDone");
        el18.click();
    }
}
