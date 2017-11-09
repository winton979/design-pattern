import org.junit.Test;

/**
 * Created by winton on 2017/11/9.
 */
public class FirstTest {

    /*

     */
    @Test
    public void test1() {
        R r = new R();
        r.code = 1;
        r.msg = "hi";
        System.out.println(r.code);
        R.staticInt ++;
        System.out.println(R.staticInt);
        System.out.println(System.getProperty("user.name"));
    }
}

class R{
    static int staticInt = 1;
    int code;
    String msg;
}
