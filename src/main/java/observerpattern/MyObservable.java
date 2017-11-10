package observerpattern;

import java.util.Observable;

/**
 * Created by winton on 2017/11/10.
 */
public class MyObservable extends Observable{

    public void newArticle(String title) {
        this.setChanged();
        this.notifyObservers(title);
    }

}
