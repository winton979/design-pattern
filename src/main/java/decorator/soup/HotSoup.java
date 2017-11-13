package decorator.soup;

import decorator.Soup;

/**
 * 热汤基础2元
 */
public class HotSoup extends Soup {

    public HotSoup() {
        description = "nomal hot Soup";
    }

    @Override
    public double cost() {
        return 2;
    }

}
