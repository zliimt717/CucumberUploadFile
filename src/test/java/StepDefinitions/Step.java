package StepDefinitions;

import ObjectPage.UploadPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Step {

    public static WebDriver driver;
    public UploadPage uploadPage;

    @Given("User launchs the browser")
    public void user_launchs_the_browser() {
        System.setProperty("webdriver.gecko.driver",
                System.getProperty("user.dir")+"\\src\\Driver\\geckodriver.exe");
        driver=new FirefoxDriver();
        uploadPage=new UploadPage(driver);
    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
    }
    @Then("Click on choose file")
    public void click_on_choose_file() {
       //uploadPage.clickChooseFile();
        WebElement uploadBtn= driver.findElement(By.id("file-upload"));
        uploadBtn.sendKeys("C:\\Users\\xin.gu\\OneDrive - Accenture\\Desktop\\winnie.jpg");

    }
    @Then("Click on submit file")
    public void click_on_submit_file() {
      //  uploadPage.clickSubmit();
        uploadPage.clickSubmit();
    }
    @Then("Check the sent file,Close the browser")
    public void check_the_sent_file() throws InterruptedException {
        if(driver.getPageSource().contains("File Uploaded")){
            System.out.println("The file is uploaded!");
            Thread.sleep(3000);
            driver.quit();
        }else {
            System.out.println("File not uploaded");
        }
    }

}
