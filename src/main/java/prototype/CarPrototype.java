package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by winton on 2017/11/15.
 */
public class CarPrototype {

    public static Map<String, Car> carPrototype = new HashMap();

    static {
        Benz b = new Benz();
        carPrototype.put("benz",b);

        Toyota t = new Toyota();
        carPrototype.put("toyota",t);
    }

    public static Car getCar(String name) {
        return carPrototype.get(name).deepClone();
    }

}
