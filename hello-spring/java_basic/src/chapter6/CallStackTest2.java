package chapter6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main 시작");
        first();
        System.out.println("main 끝");
    }

    static void first() {
        System.out.println("first 시작");
        second();
        System.out.println("first 끝");
    }

    static void second() {
        System.out.println("second 시작");
        System.out.println("second 끝");
    }
}
