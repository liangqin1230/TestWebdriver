package moretvCMS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by hc on 2017/6/14.
 */
public class login {

    private static String url ="http://testcms.tvmore.com.cn/mtv_cms/logon.action";
    private static String login_title = "电视猫视频 智能电视第一视频应用";
    WebDriver driver;

    @Before
    public void before() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.get(url);
    }

    @After
    public void after() throws Exception {
        driver.quit();
    }

    /**
     * 登录成功
     */
    @Test
    public void testLogin001() throws Exception {

        WebElement username = driver.findElement(By.name("login_name"));
        username.sendKeys("tester");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("moretv");
        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
        String pageTitle = driver.getTitle();
        System.out.print(pageTitle);
        assertEquals("登录成功", pageTitle, "SmartTV-CMS");

    }
    /**
     * 使用错误的用户名密码登录
     */
    @Test
    public void testLoin002() throws Exception {

        WebElement username = driver.findElement(By.name("login_name"));
        username.sendKeys("111");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("111");
        WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
        String pageTitle = driver.getTitle();
        assertEquals("登录-用户名密码错误", pageTitle, login_title);


    }

//    /**
//     * 登录-用户名密码为空直接登录
//     */
//    @Test
//    public void testLogin002() throws Exception {
//
//        WebElement btn = driver.findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
//        btn.click();
//        Alert alert = driver.switchTo().alert();
//        String string = alert.getText();
//        alert.accept();
//        assertEquals("登录-用户名密码为空", "用户名或密码不能为空！", string);
//
//    }

}
