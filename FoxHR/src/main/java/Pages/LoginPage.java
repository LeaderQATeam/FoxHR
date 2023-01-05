package Pages;

public class LoginPage {

    private WebElement passTxt;
    private WebDriverWait wait;

    @FindBy(xpath="//*[@placeholder=\"User Name\"]")
    private WebElement userNameTxt;

    @FindBy(xpath="//*[@placeholder=\"Password\"]")
    private WebElement passwordTxt;

    public  LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, 40);
    }

}
