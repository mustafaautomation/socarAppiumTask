package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CodeVerification extends Base {

    public CodeVerification(AppiumDriver driver) {super(driver);}

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.EditText")
    AndroidElement otpField ;



    public void fillAndSubmitOtp(String Otp) throws InterruptedException {
        Thread.sleep(2000);
        otpField.sendKeys(Otp);
        Thread.sleep(20000);


    }



}
