package facade;

import facade.Impl.ApplePay;
import facade.Impl.WeiXinPay;
import facade.Impl.ZhiFuBaoPay;

/**
 * Created by winton on 2017/11/9.
 */
public class PayMaker {

    private IPay weiXinPay;

    private IPay applePay;

    private IPay zhiFuBaoPay;

    public PayMaker() {
        this.weiXinPay = new WeiXinPay();
        this.applePay = new ApplePay();
        this.zhiFuBaoPay = new ZhiFuBaoPay();
    }

    public void weiXinAdd(int balance) {
        weiXinPay.addBalance(balance);
    }

    public void applePayAdd(int balance) {
        applePay.addBalance(balance);
    }

    public void zhiFuBaoAdd(int balance) {
        zhiFuBaoPay.addBalance(balance);
    }
}
