package testcases;

import com.google.gson.JsonObject;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.*;

import java.util.concurrent.TimeUnit;


public class TestCases extends BaseTest{
    private  JsonObject signupDetails,profileDetails ;
    private String otpNumber;
    
    //Setup of Data before execution of cases
    @BeforeSuite
    public void dataSetup(){

        //Data prepared from Data utility class
        signupDetails = dataCreator.signupData();
        profileDetails = dataCreator.profileData();
        otpNumber = dataCreator.otpData();


    }
    //TestCase to validate that all navigation menus are working and also being asserted
    @Test(priority = 1,description="Validate that all Navigation Menus are opening")
    public void test1() throws InterruptedException {

        //initialize Page object class
        HomeScreen homeScreen = new HomeScreen(driver);

        //Going through different navigation pages and asserting that they are opened
        Assert.assertTrue(homeScreen.exploreButtonSelectedState());
        homeScreen.tapOnAccountButton();

        Assert.assertTrue(homeScreen.accountButtonSelectedState());
        homeScreen.tapOnHostButton();

        Assert.assertTrue(homeScreen.hostButtonSelectedState());
        homeScreen.tapOnAccountButton();

        Assert.assertTrue(homeScreen.accountButtonSelectedState());
        homeScreen.tapOnExploreButton();

        Assert.assertTrue(homeScreen.exploreButtonSelectedState());
        homeScreen.tapOnBookingsButton();

        Assert.assertTrue(homeScreen.bookingsButtonSelectedState());
       
    }

    @Test(priority = 2,description="Validate that user can complete signup process and data is accurate")
    public void test2() throws InterruptedException {

        //initialize Page object class
        HomeScreen homeScreen = new HomeScreen(driver);
        AccountPage accountPage = new AccountPage(driver);
        SignupForm signupForm = new SignupForm(driver);
        DetailsForm detailsForm = new DetailsForm(driver);
        CodeVerification codeVerification = new CodeVerification(driver);
        CompleteProfile completeProfile = new CompleteProfile(driver);
        AccountMenu accountMenu = new AccountMenu(driver);
        EditProfile editProfile = new EditProfile(driver);

        //Going through different stages of signup and filling form and asserting that user is being created successfully or not
        homeScreen.tapOnAccountButton();
        Assert.assertTrue(homeScreen.accountButtonSelectedState());
        accountPage.clickonSignupButton();
        signupForm.fillSignupForm(signupDetails);
        detailsForm.fillDetails(profileDetails);
        codeVerification.fillAndSubmitOtp(otpNumber);




    }

    @Test(priority = 3,description="Validate User can login with same credentials with which signup was done and validate data")
    public void Test3() throws InterruptedException {

        HomeScreen homeScreen = new HomeScreen(driver);
        AccountPage accountPage = new AccountPage(driver);
        LoginForm loginForm  = new LoginForm(driver);
        AccountMenu accountMenu = new AccountMenu(driver);
        EditProfile editProfile = new EditProfile(driver);


        //Going through Login AND TO Validate that user can login and asserting that correct user has logged in
        homeScreen.tapOnAccountButton();
        Assert.assertTrue(homeScreen.accountButtonSelectedState());
        accountPage.clickonLoginButton();
        loginForm.fillLoginForm(signupDetails);
        homeScreen.tapOnAccountButtonsignIN();
        Assert.assertEquals(profileDetails.get("firstName").getAsString(),accountMenu.returnFirstName());
        Assert.assertEquals(profileDetails.get("lastName").getAsString(),accountMenu.returnLastName());
        accountMenu.tapOnEditProfileBtn();
        editProfile.swipeToNumberField();
        Assert.assertEquals(signupDetails.get("email").getAsString(),editProfile.returnEmailStr());


    }

    @BeforeTest
    @Override
    public void setUpPage() {

    }


}