package chapter7;

class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        //
    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();  //당연히 에러 생성자의 접근제어자가 private 이기 때문에 클래스 내부에서만 인스턴스 생성가능
        Singleton s = Singleton.getInstance(); //이렇게 public static 메서드를 이용해서 클래스내부에서 인스턴스를 생성한것을 사용할 수 있다.
    }
}
