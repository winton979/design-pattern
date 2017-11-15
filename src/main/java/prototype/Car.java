package prototype;

import java.io.*;

/**
 * Created by winton on 2017/11/15.
 */
public abstract class Car implements Serializable{

    private static final long serialVersionUID = 1L;

    abstract void run();

    public Car deepClone() {
        try {
            // 写入当前对象的二进制流
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

		    // 读出二进制流产生的新对象
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Car) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }

}
