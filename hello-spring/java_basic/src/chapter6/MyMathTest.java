package chapter6;

class MyMath {
    long a, b;

    long add() {
        return a + b;
    }
    long substract() {
        return a - b;
    }
    long multiply() {
        return a * b;
    }
    double divide() {
        return a / b;
    }

    static long add(long a, long b) {
        return a + b;
    }
    static long substract(long a, long b) {
        return a - b;
    }
    static long multiply(long a, long b) {
        return a * b;
    }
    static double divide(double a, double b) {
        return a / b;
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        System.out.println(MyMath.add(3,5));
        System.out.println(MyMath.substract(3,5));
        System.out.println(MyMath.multiply(3,5));
        System.out.println(MyMath.divide(3,5));

        MyMath mm = new MyMath();
        mm.a = 100;
        mm.b = 34;
        System.out.println(mm.add());
        System.out.println(mm.divide());

    }
}
