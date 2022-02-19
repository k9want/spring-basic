package chapter7;

class Parent7_3 {
    int x = 150;

    void method() {
        System.out.println("Parent");
    }
}

class Child7_3 extends Parent7_3 {

    int x = 250;

    @Override
    void method() {
        System.out.println("Child");
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
public class BindingTest3 {
    public static void main(String[] args) {
        Parent7_3 p = new Parent7_3();
        Child7_3 c = new Child7_3();

        System.out.println(p.x);
        System.out.println("----------");
        p.method();
        System.out.println("----------");
        System.out.println(c.x);
        System.out.println("----------");
        c.method();

    }
}
