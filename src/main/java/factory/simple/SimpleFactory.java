package factory.simple;

public class SimpleFactory {

    public Car createCar(String car) {
        switch (car) {
            case "ford" :
                return new Ford();
            case "toyota" :
                return new Toyota();
            default: return null;
        }
    }

}
