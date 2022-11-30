package AXCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AXC_Home_Login_Page {
    WebDriver driver;

    public AXC_Home_Login_Page(WebDriver driver) {
        this.driver = driver;
    }

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
