package AXCTestCases;

import AXCPages.AXC_Home_Login_Page;
import AXCPages.AXC_Secrets_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AXC_Login_Test {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(opt);

        driver.manage().window().maximize();
        driver.get("https://account.axcrypt.net/en/Home/Login");

        AXC_Home_Login_Page home = new AXC_Home_Login_Page(driver);
        AXC_Secrets_Page secret = new AXC_Secrets_Page(driver);

        home.enterEmail("Saisailajapattipati@axcrypt.net");
        home.enterPSWD("Suneel@143");
        home.SelectShowbtn();
        home.Select_Sign_in_btn();
        System.out.println("landing in the secretpage");
        secret.Select_Sign_out_btn();
        driver.quit();

    }


}
