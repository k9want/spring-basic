package chapter7;

public class InstanceofTest {
    public static void main(String[] args) {
         FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("FireEngine instance");
        }

        if (fe instanceof Car) {
            System.out.println("Car instance");
        }

        if (fe instanceof Object) {
            System.out.println("Object instance");
        }
        System.out.println(fe.getClass().getName());
    }
}
