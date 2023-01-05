package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 40);
    }


    @FindBy(xpath = "//input[@placeholder='User Name']")
    private WebElement userNameTxt;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passWordTxt;

    @FindBy(xpath = "//button[@type=\"button\"]")
    private WebElement loginBtn;

    @FindBy(xpath = "//button[contains(text(),\"Accept\")]")
    private WebElement acceptCookies;


    public void Login(String username, String password) {

        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOf(acceptCookies),
                ExpectedConditions.visibilityOf(userNameTxt),
                ExpectedConditions.visibilityOf(passWordTxt),
                ExpectedConditions.visibilityOf(loginBtn)));

        this.acceptCookies.click();
        this.userNameTxt.sendKeys(username);
        this.passWordTxt.sendKeys(password);
        this.loginBtn.click();
        wait.until(ExpectedConditions.urlContains("https://customer3.leadergroup.com/hr/home"));

    }





}
