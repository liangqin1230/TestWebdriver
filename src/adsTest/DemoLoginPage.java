package adsTest;

/**
 * Created by hc on 2018/3/15.
 */
public class DemoLoginPage {

    //注册页面，输入错误信息，检查提示
    public  static void errMessage(String type,String value,String keys) throws Exception{

        UIExecutor.findElementSendKeys(type, value, keys);
        Thread.sleep(1000);
    }
}
