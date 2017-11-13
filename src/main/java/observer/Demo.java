package observer;

import observer.Observer.LogObserver;
import observer.Observer.NotifyObserver;

/**
 * Created by winton on 2017/11/10.
 */
public class Demo {

    public static void main(String[] args) {
        // subject
        MyObservable mo = new MyObservable();

        // observer
        LogObserver lser = new LogObserver();
        NotifyObserver nser = new NotifyObserver();
        // add
        mo.addObserver(lser);
        mo.addObserver(nser);

        mo.newArticle("震惊部发来的新消息：啊哈哈哈");

    }

}
