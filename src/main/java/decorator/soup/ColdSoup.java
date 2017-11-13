package decorator.soup;

import decorator.Soup;

/**
 * 冷汤基础2元
 */
public class ColdSoup extends Soup {

    public ColdSoup() {
        description = "nomal cold Soup";
    }

    @Override
    public double cost() {
        return 2;
    }

}
