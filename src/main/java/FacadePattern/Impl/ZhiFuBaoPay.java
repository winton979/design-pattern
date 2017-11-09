package FacadePattern.Impl;

import FacadePattern.Demo;
import FacadePattern.IPay;

/**
 * Created by winton on 2017/11/9.
 */
public class ZhiFuBaoPay implements IPay {

    public int addBalance(int balance) {
        // 各自的业务逻辑
        Demo.myBalace = balance + Demo.myBalace;
        System.out.println("执行了支付宝支付");
        return Demo.myBalace;
    }
}
