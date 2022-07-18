package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class HomeScreen extends Base {
    /**
     * A base constructor that sets the page's driver
     * <p>
     * The page structure is being used within this test in order to separate the
     * page actions from the tests.
     * <p>
     * Please use the AppiumFieldDecorator class within the page factory. This way annotations
     * like @AndroidFindBy within the page objects.
     *
     * @param driver the appium driver created in the beforesuite method.
     */
    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }



    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"GuestHomeScreen, tab, 1 of 4\"]")
    AndroidElement exploreButton ;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"GuestBookingScreen, tab, 2 of 4\"]")
    AndroidElement bookingsButton ;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"GuestHostScreen, tab, 3 of 4\"]")
    AndroidElement hostButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"LandingScreen, tab, 4 of 4\"]")
    AndroidElement accountButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"AccountScreen, tab, 4 of 4\"]")
    AndroidElement accountButtonsignIn;


    public void tapOnExploreButton(){
        exploreButton.click();

    }

    public void tapOnBookingsButton(){
        bookingsButton.click();

    }

    public void tapOnHostButton(){
        hostButton.click();

    }

    public void tapOnAccountButton() throws InterruptedException {
        Thread.sleep(5000);
        accountButton.click();

    }
    public void tapOnAccountButtonsignIN(){
        accountButtonsignIn.click();

    }

    public boolean exploreButtonSelectedState(){

       return exploreButton.isSelected();


    }

    public boolean bookingsButtonSelectedState(){

        return bookingsButton.isSelected();


    }

    public boolean hostButtonSelectedState(){

        return hostButton.isSelected();


    }

    public boolean accountButtonSelectedState(){

        return accountButton.isSelected();


    }


}