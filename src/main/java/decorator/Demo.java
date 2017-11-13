package decorator;

import decorator.Condiment.Caraway;
import decorator.Condiment.Pepper;
import decorator.soup.HotSoup;

public class Demo {

    public static void main(String[] args) {
        Soup hot = new HotSoup();

        hot = new Pepper(hot);
        hot = new Caraway(hot);

        System.out.println(hot.getDescription());
        System.out.println(hot.cost());

    }

}
