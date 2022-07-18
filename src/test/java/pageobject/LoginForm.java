package pageobject;

import com.google.gson.JsonObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.PropertyUtils;

public class LoginForm extends Base{
    public LoginForm(AppiumDriver driver){
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.EditText")
    AndroidElement emailField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.EditText")
    AndroidElement passwordField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.TextView")
    AndroidElement submitBtn ;


    public void fillLoginForm(JsonObject signupDetails) throws InterruptedException {
        Thread.sleep(2000);
        emailField.sendKeys(signupDetails.get("email").getAsString());
        Thread.sleep(2000);
        passwordField.sendKeys(PropertyUtils.getProperty("password"));
        Thread.sleep(2000);
        submitBtn.click();

    }
}
