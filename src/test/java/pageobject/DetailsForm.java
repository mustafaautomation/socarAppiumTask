package pageobject;

import com.google.gson.JsonObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DetailsForm extends Base{
    public DetailsForm(AppiumDriver driver) {
        super(driver);



    }



    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.EditText")
    AndroidElement firstNameField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[5]/android.widget.EditText")
    AndroidElement lastNameField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.TextView")
    AndroidElement dobField  ;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CONFIRM']")
    AndroidElement dobConfirmBtn ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.TextView")
    AndroidElement  mobileCodeField;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[11]/android.view.ViewGroup")
    AndroidElement mobileNation ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[8]/android.widget.EditText")
    AndroidElement mobileNumberField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[9]/android.view.ViewGroup")
    AndroidElement nationalityField ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[11]/android.view.ViewGroup")
    AndroidElement mobileNation1 ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[10]/android.widget.TextView")
    AndroidElement submitBtn;

    @AndroidFindBy(xpath = "//android.widget.NumberPicker[3]/android.widget.Button[@text='2003']")
    AndroidElement dobteBtn;


    public void fillDetails(JsonObject profileDetails) throws InterruptedException {

        Thread.sleep(2000);
        firstNameField.sendKeys(profileDetails.get("firstName").getAsString());
        Thread.sleep(2000);
        lastNameField.sendKeys(profileDetails.get("lastName").getAsString());
        Thread.sleep(2000);
        dobField.click();
        Thread.sleep(2000);
        dobteBtn.click();
        Thread.sleep(2000);
        dobConfirmBtn.click();
        Thread.sleep(2000);
        mobileCodeField.click();
        Thread.sleep(2000);
        mobileNation.click();
        Thread.sleep(2000);
        mobileNumberField.sendKeys(profileDetails.get("phoneNumber").getAsString());
        Thread.sleep(2000);
        nationalityField.click();
        Thread.sleep(2000);
        mobileNation1.click();
        Thread.sleep(2000);
        submitBtn.click();
    }






}
