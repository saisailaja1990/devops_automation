package AXCPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AXC_Secrets_Page {
    WebDriver driver;

    public AXC_Secrets_Page(WebDriver driver) {
        this.driver = driver;
    }
    By Sign_out = By.xpath("//li[@class='logout']");
    public void Select_Sign_out_btn()
    {
        driver.findElement(Sign_out).click();
    }

}
