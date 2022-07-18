package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountPage extends Base{
    public AccountPage(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SIGN UP']")
    AndroidElement signupBtn ;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOGIN']")
    AndroidElement loginBtn ;

    public void clickonSignupButton(){

         signupBtn.click();
    }

    public void clickonLoginButton(){

        loginBtn.click();
    }
}
