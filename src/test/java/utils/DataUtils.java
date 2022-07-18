package utils;

import com.github.javafaker.Faker;
import com.google.gson.JsonObject;



public class DataUtils {

    Faker faker = new Faker();



    public JsonObject signupData(){

        JsonObject signupDetails = new JsonObject();
        signupDetails.addProperty("email",faker.internet().emailAddress());
        signupDetails.addProperty("referralCode",faker.avatar().hashCode());
        return signupDetails;

    }

    public JsonObject profileData(){

        JsonObject profileDetails = new JsonObject();
        profileDetails.addProperty("firstName",faker.name().firstName());
        profileDetails.addProperty("lastName",faker.name().lastName());
        profileDetails.addProperty("phoneNumber",faker.number().numberBetween(1234567890,999999999));
        return profileDetails;

    }
    public String otpData(){

        int number = faker.number().numberBetween(1234,9999);
        return Integer.toString(number);
    }

}
