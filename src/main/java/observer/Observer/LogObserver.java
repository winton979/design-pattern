package observer.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by winton on 2017/11/10.
 */
public class LogObserver implements Observer{

    public void update(Observable o, Object arg) {
        System.out.println("此处更新数据库日志文件。内容为：" + String.valueOf(arg));
    }
}
