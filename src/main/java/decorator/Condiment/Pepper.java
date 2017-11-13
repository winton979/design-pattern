package decorator.Condiment;

import decorator.CondimentDecorator;
import decorator.Soup;

/**
 * 加辣椒
 */
public class Pepper extends CondimentDecorator {

    Soup soup;

    public Pepper(Soup soup) {
        this.soup = soup;
    }

    @Override
    public String getDescription() {
        return soup.getDescription() + ", pepper";
    }

    @Override
    public double cost() {
        return soup.cost() + 0.2;
    }
}
