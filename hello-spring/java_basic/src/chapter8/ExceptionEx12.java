package chapter8;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception{
        method1();
        System.out.println("실행 종료");
    }
    static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method2() throws Exception {
        throw new Exception(); //예외 발생
    }

}
