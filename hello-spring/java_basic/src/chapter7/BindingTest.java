package chapter7;

class Parent7 {
    int x = 100;

    void method() {
        System.out.println("Parent method");
    }
}

class Child7 extends Parent7 {
    int x = 200;

    @Override
    void method() {
        System.out.println("Child method");
    }
}


public class BindingTest {
    public static void main(String[] args) {
        Parent7 p = new Child7();
        Child7 c = new Child7();
        System.out.println(p.x); // 상속관계에서 각 멤버변수가 중복인 경우에는 참조변수에 따라 달라진다.
        System.out.println(c.x);
        p.method(); //메서드는 참조변수 관계없이 인스턴스의 메서드가 호출된다.
        c.method();

    }
}
