import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MakeADonation {
    private WebDriver driver;
    private Methods methods;
    @Before
    public void setUp(){
        System.setProperty("webdriver.opera.driver", "C:\\Users\\Андрей\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://crowdfund.umn.edu/?cfpage=project&project_id=32920");
       methods = new Methods(driver);
      }
    @Test
        public void makeADonation(){
        methods.donateNowMain();
        methods.searchForm("at");
        methods.searchButton();
        methods.donateToDiversity();
        methods.randomValueOfDonate();
        methods.encourageMessage("qwerty");
        methods.giftOnBeHalfOfMyCompany();
        methods.companyName("qwerty");
        methods.name("Andrew");
        methods.surname("Mulenko");
        methods.list();
        methods.showMyName("qwerty");
        methods.eMail("anmulenko2@gmail.com");
        /*methods.donateCCButton();*/
        }
    @After
    public void tearDown(){
        driver.quit();
    }
}

