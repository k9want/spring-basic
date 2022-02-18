package chapter7;

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, go~");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water~~!!");
    }
}

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water() //car 잠조변수로는 불가능
        fe2 = (FireEngine) car;
        fe2.water();
    }
}
