package adsTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by hc on 2018/3/8.
 */
public class Login {

    private static String file = "D:\\downloads\\chromedriver.exe";
    private static String url ="http://test-ams.moretv.cn/login";

    public  WebDriver driver;

    String right_username = "liang.qin01@whaley.cn";
    String right_password = "123456";
    String success_value = "登录成功";

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
    @Test
    public void adsLogin001() throws Exception {

//        WebElement username = driver.findElements(By.className("el-input__inner")).get(0);
//        username.sendKeys(right_username);
//        WebElement passowrd = driver.findElements(By.className("el-input__inner")).get(1);
//        passowrd.sendKeys(right_password);
//        WebElement botton = driver.findElement(By.cssSelector("button[class='el-button el-button--primary']"));
//        botton.click();

//        WebElement username = UIExecutor.findElement("className","el-input__inner",0);
//        username.sendKeys(right_username);
//        WebElement passowrd = UIExecutor.findElement("className", "el-input__inner", 1);
//        passowrd.sendKeys(right_password);
//        Thread.sleep(1000);

        LoginPage.Login(right_username,right_password);
        String success = driver.findElement(By.className("el-message__content")).getText();
        System.out.print(success);
        assertEquals("登录成功", success_value, "登录成功");
    }
}
