package TestCases;

import Heplers.JsonReader;
import Pages.LoginPage;
import com.google.gson.JsonObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertLoginTest extends BaseTest {


    private LoginPage loginpage;
    private JsonObject internalInfo;

/*
    @BeforeClass
    public void init()
    {

        internalInfo = new JsonObject();
        JsonReader jsonReader = new JsonReader();
        *//*
        read user data form the path of userInfo defined in test.properties file
        userInfo is a json object that now contains the user data in the file userData.json
         *//*
        internalInfo = jsonReader.getJsonObject(System.getProperty("path.internalinfo"));
        createPage = new CreateInterenalCor(webDriver);
    }

    */

    @BeforeTest

    public void login() {

        //open application URL
        webDriver.get(System.getProperty("target.homepage"));
        // initialize an object from login page
        loginpage = new LoginPage(webDriver);
        // login with username and password provided from test.properties file
        loginpage.Login(System.getProperty("account.username"),
                System.getProperty("account.password"));
    }

    @Test
    public void assertLogin() {

        String expectedUrl = "https://customer3.leadergroup.com/hr/home";
        String actualUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }


}
