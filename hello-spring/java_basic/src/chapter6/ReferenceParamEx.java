package chapter6;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(); = " + d.x);

        referenceChange(d);
        System.out.println("After change: " + d.x);

    }

    static void referenceChange(Data d) {
        d.x = 1000;
        System.out.println("referenceChange(); = " + d.x);
    }
}
