package facade.Impl;

import facade.Demo;
import facade.IPay;

/**
 * Created by winton on 2017/11/9.
 */
public class WeiXinPay implements IPay{
    public int addBalance(int balance) {
        // 各自的业务逻辑
        Demo.myBalace = balance + Demo.myBalace;
        System.out.println("执行了微信支付");
        return Demo.myBalace;
    }
}
