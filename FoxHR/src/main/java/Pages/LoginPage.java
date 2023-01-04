package Pages;

public class LoginPage {

    @FindBy(xpath="//*[@placeholder=\"User Name\"]")
    private WebElement userNameTxt;
    @FindBy(xpath="//*[@placeholder=\"Password\"]")
    private WebElement passTxt;

}
