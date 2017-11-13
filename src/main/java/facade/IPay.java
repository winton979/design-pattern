package facade;

/**
 * Created by winton on 2017/11/9.
 */
public interface IPay {

    /**
     * 充值
     * @param 数量，单位分
     * @return 余额
     */
    int addBalance(int balance);

}
