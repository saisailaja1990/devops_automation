package AXCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AXC_Home_Login_Page {
    WebDriver driver;

    public AXC_Home_Login_Page(WebDriver driver) {
        this.driver = driver;
    }
    /*@FindBy(id="useremail")
    WebElement EmailID;
    */
     /*@FindBy(id="useremail")
    WebElement password;
    */
     /*@FindBy("togglePassword")
    WebElement showPSW;
    */
     /*@FindBy(id="//input[@class='button signin-button success']")
    WebElement Sign_in_btn;
    */

    By EmailID = By.id("useremail");
    By password = By.id("login-temp-password");
    By showPSW = By.id("togglePassword");
    By Sign_in_btn = By.xpath("//input[@class='button signin-button success']");


    public void enterEmail(String user)

    {
        driver.findElement(EmailID).sendKeys(user);
    }
    public void enterPSWD(String passWD)
    {
        driver.findElement(password).sendKeys(passWD);
    }
    public void SelectShowbtn()
    {
        driver.findElement(showPSW).click();
    }
    public void Select_Sign_in_btn()
    {
        driver.findElement(Sign_in_btn).click();
    }
}
