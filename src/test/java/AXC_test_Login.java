import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.Set;

public class AXC_test_Login {
    //public WebDriver driver;
    public static void main(String[] args) {


        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
// Launching the browser
       // driver=new ChromeDriver(opt);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(opt);


        driver.manage().window().maximize();
        String URL;
        driver.get("https://account.axcrypt.net/en/Home/Login");
        URL=driver.getTitle();
        String URL1;
        URL1= driver.getCurrentUrl();
        WebElement EmailID= driver.findElement(By.id("useremail"));
        EmailID.sendKeys("Saisailajapattipati@axcrypt.net");
        WebElement password= driver.findElement(By.id("login-temp-password"));
        password.sendKeys("Suneel@143");
        WebElement showPSW= driver.findElement(By.id("togglePassword"));
        showPSW.click();
        WebElement Sign_in_btn=driver.findElement(By.xpath("//input[@class='button signin-button success']"));
        Sign_in_btn.click();
        WebElement signout=driver.findElement(By.xpath("//li[@class='logout']"));
        signout.click();
        String Expected_URL="Sign in - AxCrypt - File security for you and your team";
        String Expected_URL1="https://account.axcrypt.net/en/Home/Login";
        Assert.assertEquals(Expected_URL,URL);
        Assert.assertEquals(Expected_URL1,URL1);
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);


        driver.quit();
        driver.close();

    }
}
