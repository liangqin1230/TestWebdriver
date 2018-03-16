package test.SeleniumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/** 
* TestHelloWorld Tester. 
* 
* @author <Authors name> 
* @since <pre>七月 15, 2016</pre> 
* @version 1.0 
*/ 
public class TestHelloWorldTest {
    //WebDriver driver = new FirefoxDriver();

    public WebDriver setDriver() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

@Before
public void before() throws Exception {
    setDriver().get("http://test-sailfishcms.tvmore.com.cn/medusa_sailfish/login.shtml");
} 

@After
public void after() throws Exception {
    setDriver().close();
} 

/** 
* 使用错误的用户名密码登录
*/ 
@Test
public void  testLogin001() throws Exception {

//    WebElement username = driver.findElement(By.name("username"));
//    username.sendKeys("test");
//    WebElement password = driver.findElement(By.name("password"));
//    password.sendKeys("111");
//    WebElement btn = driver.findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
//    btn.click();
//    Alert alert = driver.switchTo().alert();
//    String string = alert.getText();
//    alert.accept();
//    assertEquals("登录-使用错误的用户名密码", "用户或密码不正确！", string);

    WebElement username = setDriver().findElement(By.name("username"));
    username.sendKeys("test");
    WebElement password = setDriver().findElement(By.name("password"));
    password.sendKeys("111");
    WebElement btn = setDriver().findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
    btn.click();
    Alert alert = setDriver().switchTo().alert();
    String string = alert.getText();
    alert.accept();
    assertEquals("登录-使用错误的用户名密码", "用户或密码不正确！", string);

}

    /**
     * 登录-用户名密码为空直接登录
     */
    @Test
    public void testLogin002() throws Exception {

//        WebElement btn = driver.findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
//        btn.click();
//        Alert alert = driver.switchTo().alert();
//        String string = alert.getText();
//        alert.accept();
//        assertEquals("登录-用户名密码为空", "用户名或密码不能为空！", string);

    }

    /**
     * 登录成功
     */
    @Test
    public void testLogin003() throws Exception {

//        WebElement username = driver.findElement(By.name("username"));
//        username.sendKeys("admin");
//        WebElement password = driver.findElement(By.name("password"));
//        password.sendKeys("123");
//        WebElement btn = driver.findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
//        btn.click();
//        boolean status;
//        try {
//            driver.findElement(By.xpath("//*[contains(.,'欢迎进入Sailfish系统')]"));
//            status = true;
//        }catch (Exception e){
//            status = false;
//        }
//        assertEquals("登录成功", true, status);

    }
} 
