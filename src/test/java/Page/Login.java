package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Login  {
    WebDriver driver;
    @FindBy(className = "header-links-wrapper")
    WebElement linkbtn;
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginbtn;
    @FindBy(id ="Username")
    WebElement usernamebtn;
    @FindBy(id = "Password")
    WebElement passwordbtn;
    @FindBy(xpath = "//body/div[5]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]")
    WebElement submitbtn;
    @FindBy(xpath = "//a[contains(text(),'nazmul35-1885@diu.edu.bd')]")
    WebElement ibnusername;
    @FindBy(xpath = "//body[1]/div[5]/div[4]/div[3]/div[2]/div[1]/h1[1]")
    WebElement dailyneed;


    public Login (WebDriver driver ) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String dologin(String email,String password){
        linkbtn.click();
        loginbtn.click();
        usernamebtn.sendKeys(email);
        passwordbtn.sendKeys(password);
        submitbtn.click();
        linkbtn.click();
        return ibnusername.getText();
    }




}
