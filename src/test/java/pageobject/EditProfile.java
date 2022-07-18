package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.AppiumUtils;
import utils.StringUtils;

public class EditProfile extends Base{
    public EditProfile(AppiumDriver driver){
        super(driver);
    }
    AppiumUtils appUtils = new AppiumUtils();
    StringUtils str = new StringUtils();

    @AndroidFindBy(xpath = "//android.view.ViewGroup[6]/android.widget.TextView[2]")
    AndroidElement emailTextView;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[8]/android.widget.TextView[2]")
    AndroidElement phoneNumberTextView ;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[9]/android.widget.TextView[2]")
    AndroidElement lastEl ;


    public String returnEmailStr() throws InterruptedException {
        Thread.sleep(2000);
       return emailTextView.getText();
    }

    public String returnPhoneStr() throws InterruptedException {

        Thread.sleep(2000);
        return phoneNumberTextView.getText();
    }

    public void swipeToNumberField() throws InterruptedException {

        Thread.sleep(2000);
        appUtils.scrollToElement(lastEl,driver);

    }



}
