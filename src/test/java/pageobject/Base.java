package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyUtils;
import utils.WaitUtils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Base {
    public final static int IMPLICIT_WAIT = PropertyUtils.getIntegerProperty("implicitWait", 30);
    WaitUtils waitUtils;
    protected final AppiumDriver driver;

    /**
     * A base constructor that sets the page's driver
     *
     * The page structure is being used within this test in order to separate the
     * page actions from the tests.
     *
     * Please use the AppiumFieldDecorator class within the page factory. This way annotations
     * like @AndroidFindBy within the page objects.
     *
     * @param driver the appium driver created in the beforesuite method.
     */
    protected Base(AppiumDriver driver){
        this.driver = driver;
        initElements();
        loadProperties();
        waitUtils = new WaitUtils();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    private void initElements() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(IMPLICIT_WAIT)), this);
    }

    private void loadProperties() {
        //TODO: Add the properties.
    }

}