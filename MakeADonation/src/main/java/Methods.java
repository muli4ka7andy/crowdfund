import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


public class Methods {
    private WebDriver driver;
    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    private By donateNowMain = By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]");
    private By searchForm = By.xpath("//*[@id=\"searchterm\"]");
    private By searchButton = By.xpath("//*[@id=\"big-search\"]/label/input[2]");
    private By donateToDiversity = By.xpath("/html/body/div[1]/div/section[2]/div[2]/div[1]/a[2]/span");
    private By randomValueOfDonate = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[1]/div[1]/div/div/div/div/div/input");
    private By encourageMessage = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[1]/div[3]/div/textarea");
    private By giftOnBeHalfOfMyCompany = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[1]/fieldset/div[1]/label[2]/input");
    private By companyName = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[1]/fieldset/div[2]/div/div[2]/input");
    private By name = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[3]/fieldset/div/div/div[1]/div[1]/input");
    private By surname = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[3]/fieldset/div/div/div[1]/div[2]/input");
    private By list = By.id("donor-name-visibility");
    private By showMyName = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[3]/div[4]/div/input");
    private By email = By.xpath("/html/body/div/div/section[2]/div/div/form/fieldset[3]/div[6]/div/input");
    private By donateCCButton = By.xpath("/html/body/div/div/section[2]/div/div/form/div[2]/span[2]/button");


    public Methods donateNowMain(){
        driver.findElement(donateNowMain).click();
        return new Methods(driver);
    }
    public Methods searchForm(String search){
        driver.findElement(searchForm).sendKeys(search);
        return new Methods(driver);
    }
    public Methods searchButton() {
        driver.findElement(searchButton).click();
        return new Methods(driver);
    }
    public Methods donateToDiversity() {
        driver.findElement(donateToDiversity).click();
        return new Methods(driver);
    }
    public Methods randomValueOfDonate(){
        driver.findElement(randomValueOfDonate).sendKeys(Integer.toString(new Random().nextInt(10000)));
        return new Methods(driver);
    }
    public Methods encourageMessage(String message){
        driver.findElement(encourageMessage).sendKeys(message);
        return new Methods(driver);
    }
    public Methods giftOnBeHalfOfMyCompany() {
        driver.findElement(giftOnBeHalfOfMyCompany).click();
        return new Methods(driver);
    }
    public Methods companyName(String company){
        driver.findElement(companyName).sendKeys(company);
        return new Methods(driver);
    }
    public Methods name(String name1){
        driver.findElement(name).sendKeys(name1);
        return new Methods(driver);
    }
    public Methods surname(String surname1){
        driver.findElement(surname).sendKeys(surname1);
        return new Methods(driver);
    }
    public Methods list(){
        Select dropdown = new Select(driver.findElement(list));
        dropdown.selectByIndex(1);
        return new Methods(driver);
    }
    public Methods showMyName(String showName){
        driver.findElement(showMyName).sendKeys(showName);
        return new Methods(driver);
    }
    public Methods eMail(String myEmail){
        driver.findElement(email).sendKeys(myEmail);
        return new Methods(driver);
    }
    public Methods donateCCButton(){
        driver.findElement(donateCCButton).click();
        return new Methods(driver);
    }



}
