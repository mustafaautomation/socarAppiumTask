package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.StringUtils;

public class AccountMenu extends Base{
    public AccountMenu(AppiumDriver driver){
        super(driver);
    }

    StringUtils str = new StringUtils();

    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.TextView[1]")
    AndroidElement fullNameTextView;

    @AndroidFindBy(xpath = "//android.widget.TextView[2][@text='View and edit profile >']")
    AndroidElement editProfileBtn;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView[@text='COMPLETE MY PROFILE']")
    AndroidElement completeMyprofileBtn ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.ImageView")
    AndroidElement notificationsBtn ;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]")
    AndroidElement bookmarkBtn;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]")
    AndroidElement inviteFriendsbtn;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[5]")
    AndroidElement promosBtn;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[6]")
    AndroidElement walletBtn ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[7]")
    AndroidElement paymentsBtn ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[8]")
    AndroidElement settingsBtn ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[9]")
    AndroidElement helpBtn ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[10]")
    AndroidElement contactUsBtn ;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[11]")
    AndroidElement signoutBtn ;

    public String getfullNameText() throws InterruptedException {
        Thread.sleep(2000);
        return fullNameTextView.getText().toString();
    }

    public String returnFirstName() throws InterruptedException {
        Thread.sleep(2000);
        String firstName = str.getFirstWordFromString(getfullNameText());
        return firstName;
    }

    public String returnLastName() throws InterruptedException {
        Thread.sleep(2000);
        String lastName = str.getLastWordFromString(getfullNameText());
        return lastName;
    }

    public void tapOnEditProfileBtn() throws InterruptedException {
        Thread.sleep(2000);
        editProfileBtn.click();
    }





}
