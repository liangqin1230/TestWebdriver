package adsTest;

/**
 * Created by hc on 2018/3/9.
 * 登录页面
 */
public class LoginPage {

    //登录页面： 查找到用户名、密码输入框，并输入内容，再查找到登录按钮进行点击
    public static void Login(String user,String password) throws Exception{

        UIExecutor.findElementSendKeys("className", "el-input__inner", 0,user);
        UIExecutor.findElementSendKeys("className", "el-input__inner", 1, password);
        UIExecutor.findElementClick("cssSelector", "button[class='el-button el-button--primary']");
        Thread.sleep(1000);
    }

}
