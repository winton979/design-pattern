package prototype;

/**
 * Created by winton on 2017/11/15.
 */
public class Demo {
    public static void main(String[] args) {
        Toyota t = (Toyota) CarPrototype.getCar("toyota");
        Toyota t2 = (Toyota) CarPrototype.getCar("toyota");
        System.out.println(t);
        System.out.println(t2);
    }
}
