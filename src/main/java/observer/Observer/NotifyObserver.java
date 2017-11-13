package observer.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by winton on 2017/11/10.
 */
public class NotifyObserver implements Observer{

    public void update(Observable o, Object arg) {
        System.out.println("给所有关注者发消息，消息内容为" + String.valueOf(arg));
    }

}
