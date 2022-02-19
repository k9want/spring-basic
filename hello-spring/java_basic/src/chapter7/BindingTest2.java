package chapter7;

class Parent7_2 {
    int x = 150;

    void method() {
        System.out.println("Parent");
    }
}

class Child7_2 extends Parent7_2 {
    @Override
    void method() {
        System.out.println("Child");
    }
}

public class BindingTest2 {
    public static void main(String[] args) {
        Parent7_2 p = new Child7_2();
        Child7_2 c = new Child7_2();
        System.out.println(p.x);
        System.out.println(c.x);
        p.method();
        c.method();

    }
}
