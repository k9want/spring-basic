package chapter8;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("main메서드에서 예외 처리됨");

        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("method1내에서 예외 처리됨");
            throw e;
        }
    }
}
