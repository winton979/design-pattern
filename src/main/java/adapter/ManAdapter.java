package adapter;

/**
 * 缺少女人对象，需要用男人对象来替代
 */
public class ManAdapter implements Women {

    Man m;

    /**
     * @param man
     */
    public ManAdapter (Man man) {
        this.m = man;
    }

    @Override
    public void seatPee() {
        m.standingPee();
    }

}
