package chapter6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = new int[1];
         x[0] = 10;

        System.out.println("x[0] = " + x[0]);
        arrayChange(x);
        System.out.println("After change : " + x[0]);

    }
    static void arrayChange(int[] x) {
        x[0] = 1000;
        System.out.println("change x[0] = " + x[0]);
    }
}
