package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;


public class AppiumUtils {

    public  void scrollToElement(MobileElement element, AppiumDriver driver) {

            TouchAction swipe = new TouchAction(driver).press(PointOption.point(840, 1956))
                    .waitAction(waitOptions(ofSeconds(2)))
                    .moveTo(PointOption.point(821, 721)).release();

            swipe.perform();
    }
}