package ObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    public WebDriver uploadDriver;

    public UploadPage(WebDriver upDriver) {
        this.uploadDriver = upDriver;
        PageFactory.initElements(upDriver,this);
    }

    @FindBy(xpath = "//input[@value='Upload']")
    @CacheLookup
    WebElement btnSubmit;


    public void clickSubmit(){
        btnSubmit.click();
    }

}
