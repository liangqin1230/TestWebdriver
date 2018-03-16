package adsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by hc on 2018/3/15.

     * API封装
     */
    public class UIExecutor {

    private  static WebDriver driver = null;

    //通过不同类型查找元素element
        public static   WebElement findElement(String type, String value) {
            WebElement element = null;
            switch (type) {
                case "id":
                     element = driver.findElement(By.id(value));
                    break;
                case "name":
                     element = driver.findElement(By.name(value));
                    break;
                case "cssSelector":
                     element = driver.findElement(By.name(value));
                    break;

            }
            return element;
        }

        //通过不同类型查找元素集，指定index
        public  static WebElement findElement(String type, String value, int number) {
            WebElement element = null;
            switch (type) {
                case "className":
                    element = driver.findElements(By.className(value)).get(number);
                    break;


            }
            return element;
        }

        //输入内容
        public static void findElementSendKeys(String type, String value, int number,String keys) {
            WebElement element = findElement(type,value,number);
            element.clear();
            element.sendKeys(keys);
        }
    public static void findElementSendKeys(String type, String value,String keys) {
        WebElement element = findElement(type,value);
        element.clear();
        element.sendKeys(keys);
    }

        //点击
        public static void findElementClick(String type, String value) {
            WebElement element = findElement(type,value);
            element.click();
        }
        public static void findElementClick(String type, String value, int number) {
            WebElement element = findElement(type,value,number);
            element.click();
        }

    }
