package facade;

/**
 * 执行demo
 * Created by winton on 2017/11/9.
 */
public class Demo {
    public static int myBalace = 0;

    public static void main(String[] args) {
        PayMaker pm = new PayMaker();
        pm.applePayAdd(1);
        pm.weiXinAdd(2);
        pm.zhiFuBaoAdd(3);

        System.out.println(myBalace);
    }
}
