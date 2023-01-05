public class EmployeeTest extends BaseTest {

    private EmployeePage employeePage;

    private LoginPage loginPage;


    @BeforeClass
    public void init() {

        JsonReader jsonReader = new JsonReader();
        employeePage = new EmployeePage(webDriver);
    }

    @BeforeClass
    public void login() {

    }


}