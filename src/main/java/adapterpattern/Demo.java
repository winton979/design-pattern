package adapterpattern;

import java.util.jar.Manifest;

public class Demo {

    public static void main(String[] args) {
        Man m = new ManImpl();

        Women ma = new ManAdapter(m);

        ma.seatPee();
    }

}
