package mercuryTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by hc on 2017/6/14.
 */
public class login {

    private static String url ="http://testcms.aginomoto.com/mercury/index.html#!/login";
    //private static String url ="http://mercury.aginomoto.com/new-mercury/index.html#!/login";


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

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("shen.dongyang");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");
        WebElement btn = driver.findElement(By.cssSelector("div.wj-btn-box.login-btn"));
        btn.click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div.b-lblue.serv-block")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//div/i")).click();
        driver.findElement(By.xpath("//div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//a[contains(@href, '#!/system/MediaManagement/6/web/programManagement')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.wj-select-single")).click();//下拉点播分类
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[8]")).click();//选择节目类型：资讯
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.wj-panel-btn")).click();//查询
        Thread.sleep(5000);
//        new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("100");
//        Thread.sleep(30000);

        for (int i=0;i<3;i++){
            List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
            list.get(0).click();//全选
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[5]")).click();//同步
            Thread.sleep(10000);
            driver.findElement(By.xpath("//li[8]/a")).click();//下一页
            Thread.sleep(10000);
        }
    }

    /**
     * 翻页
     */
    @Test
    public void testLogin002() throws Exception {

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("shen.dongyang");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");
        WebElement btn = driver.findElement(By.cssSelector("div.wj-btn-box.login-btn"));
        btn.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.b-lblue.serv-block")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//div/i")).click();
        driver.findElement(By.xpath("//div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//a[contains(@href, '#!/system/MediaManagement/6/web/programManagement')]")).click();
        Thread.sleep(2000);

        for (int i=0;i<5;i++){
            List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
            list.get(0).click();//全选
            Thread.sleep(3000);
            driver.findElement(By.xpath("//li[8]/a")).click();//下一页
            Thread.sleep(10000);
        }

    }


}
