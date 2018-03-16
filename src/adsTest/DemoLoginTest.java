package adsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by hc on 2018/3/15.
 */
public class DemoLoginTest {
    private static String file = "D:\\downloads\\chromedriver.exe";
    private static String url ="https://www.oschina.net/home/reg?goto_page=http%3A%2F%2Fwww.oschina.net%2F";

    public  WebDriver driver;

     @Before
    public  void before() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
//        driver =new ChromeDriver();
//        driver.get(url);
        driver = BrowserUtil.chrome(file,url);
    }

    @After
    public  void after() throws Exception {
        driver.quit();
    }

    /**
     * 登录成功
     */
    String error = "111";
    String error_message = "请输入正确的手机号码";
    @Test
    public void DemoLogin001() throws Exception {
//        WebElement userPhone = driver.findElement(By.id("userPhone"));
//        userPhone.clear();
//        userPhone.sendKeys(error);
//        Thread.sleep(1000);

        UIExecutor.findElementSendKeys("id", "userPhone", error);

        String message = driver.findElements(By.cssSelector("div.form-tips.error")).get(0).getText();
        System.out.print(message);
//        assertEquals("验证码错误", message, error_message);
    }
}
