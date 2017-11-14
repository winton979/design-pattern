package factory.simple;

public class Demo {

    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        Car car = sf.createCar("toyota");
    }

}
