package factory.abs.impl;

import factory.abs.AbsFactory;
import factory.abs.Product1;
import factory.abs.Product2;

/**
 * Created by winton on 2017/11/15.
 */
public class AbsFactoryImpl extends AbsFactory {
    @Override
    protected Product1 createProduct1() {
        return new Product1Impl();
    }

    @Override
    protected Product2 createProduct2() {
        return new Product2Impl();
    }
}
