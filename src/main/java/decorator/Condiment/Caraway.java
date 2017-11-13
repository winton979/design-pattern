package decorator.Condiment;

import decorator.CondimentDecorator;
import decorator.Soup;

/**
 * 加香菜
 */
public class Caraway extends CondimentDecorator {

    Soup soup;

    public Caraway(Soup soup) {
        this.soup = soup;
    }

    @Override
    public String getDescription() {
        return soup.getDescription() + ", caraway";
    }

    @Override
    public double cost() {
        return soup.cost() + 0.1;
    }
}
