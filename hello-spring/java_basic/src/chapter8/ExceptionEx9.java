package chapter8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("예외 발생시키기");
            throw e;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("정상적으로 종료되었습니다.");
    }
}
