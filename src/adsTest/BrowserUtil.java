package adsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by hc on 2018/3/14.
 * 浏览器工具类
 */
public class BrowserUtil {
    private static WebDriver driver;

    //参数：chromedriver.exe本地位置，登录的网页url
    public static WebDriver chrome(String browserDriverUrl,String httpUrl) {
        System.setProperty("webdriver.chrome.driver", browserDriverUrl);
        driver = new ChromeDriver();
        driver.get(httpUrl);
        return driver;
    }


}
