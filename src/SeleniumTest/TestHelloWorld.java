/**
 * Created by hc on 2016/7/15.
 */
package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class TestHelloWorld {

//    public static void main(String[] args) {
//
//        //System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://test-sailfishcms.tvmore.com.cn/medusa_sailfish/login.shtml");
//
//        WebElement username = driver.findElement(By.name("username"));
//        username.sendKeys("test");
//        WebElement password = driver.findElement(By.name("password"));
//        password.sendKeys("111");
//        WebElement btn = driver.findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
//        btn.click();
//        Alert alert = driver.switchTo().alert();
//        String string = alert.getText();
//        alert.accept();
//        System.out.print(string);
//        driver.close();
//
//    }

    public static void main(String[] args) {

        //设置访问ChromeDriver的路径

        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testcms.tvmore.com.cn/mtv_cms/logon.action");
        WebElement username = driver.findElement(By.name("login_name"));
        username.sendKeys("tester");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("moretv");
        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        System.out.print(btn.getAttribute("value"));
        Action action;

//        btn.click();

//        driver.close();
    }

}
