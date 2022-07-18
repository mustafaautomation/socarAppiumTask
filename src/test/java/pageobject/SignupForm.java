package pageobject;

import com.google.gson.JsonObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.PropertyUtils;

public class SignupForm extends Base{
    public SignupForm(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.EditText")
    AndroidElement emailField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[5]/android.widget.EditText")
    AndroidElement passwordField ;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[6]/android.widget.EditText")
    AndroidElement referralField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[8]/android.widget.ImageView")
    AndroidElement termsCheckbox ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[11]/android.widget.TextView")
    AndroidElement submitBtn ;






    public void fillSignupForm(JsonObject signupDetails){

        emailField.sendKeys(signupDetails.get("email").getAsString());
        passwordField.sendKeys(PropertyUtils.getProperty("password"));
        referralField.sendKeys(signupDetails.get("referralCode").getAsString());
        termsCheckbox.click();
        submitBtn.click();

    }
}
