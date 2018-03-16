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
* @since <pre>���� 15, 2016</pre> 
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
* ʹ�ô�����û��������¼
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
//    assertEquals("��¼-ʹ�ô�����û�������", "�û������벻��ȷ��", string);

    WebElement username = setDriver().findElement(By.name("username"));
    username.sendKeys("test");
    WebElement password = setDriver().findElement(By.name("password"));
    password.sendKeys("111");
    WebElement btn = setDriver().findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
    btn.click();
    Alert alert = setDriver().switchTo().alert();
    String string = alert.getText();
    alert.accept();
    assertEquals("��¼-ʹ�ô�����û�������", "�û������벻��ȷ��", string);

}

    /**
     * ��¼-�û�������Ϊ��ֱ�ӵ�¼
     */
    @Test
    public void testLogin002() throws Exception {

//        WebElement btn = driver.findElement(By.xpath("//a[contains(@href,'checkUserForm')]"));
//        btn.click();
//        Alert alert = driver.switchTo().alert();
//        String string = alert.getText();
//        alert.accept();
//        assertEquals("��¼-�û�������Ϊ��", "�û��������벻��Ϊ�գ�", string);

    }

    /**
     * ��¼�ɹ�
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
//            driver.findElement(By.xpath("//*[contains(.,'��ӭ����Sailfishϵͳ')]"));
//            status = true;
//        }catch (Exception e){
//            status = false;
//        }
//        assertEquals("��¼�ɹ�", true, status);

    }
} 
