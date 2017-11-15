package factory.abs;

import factory.abs.impl.AbsFactoryImpl;

/**
 * Created by winton on 2017/11/15.
 */
public class Demo {

    public static void main(String[] args) {
        AbsFactory af = new AbsFactoryImpl();
        af.createProduct1().say();

        af.createProduct2().say();
    }

}
