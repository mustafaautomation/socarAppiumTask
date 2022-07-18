package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CompleteProfile extends Base{
    public CompleteProfile(AppiumDriver driver){
        super(driver);

    }

    @AndroidFindBy(xpath = "//android.widget.Button[1][@text='WHILE USING THE APP']")
    AndroidElement  deviceLocationPermission;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SKIP']")
    AndroidElement  skipButton;


    public void skipProfileCompletion() throws InterruptedException {
//        deviceLocationPermission.click();
        Thread.sleep(2000);
        skipButton.click();
    }

}
