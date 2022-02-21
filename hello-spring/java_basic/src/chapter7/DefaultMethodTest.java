package chapter7;


interface MyInterface {
    default void method1() {
        System.out.println("method1 MyInterface");
    }
    default void method2() {
        System.out.println("method1 MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1 MyInterface2");
    }
    default void method2() {
        System.out.println("method2 MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod MyInterface2");
    }
}

class Parent402 {
    public void method1() {
        System.out.println("method1 in Parent");
    }
}


class Child402 extends Parent402 implements MyInterface, MyInterface2 {


//    @Override
//    public void method1() {
//        System.out.println("method1 in Child");
//    }

    @Override
    public void method2() {
        System.out.println("method2 in Child");
    }
}



public class DefaultMethodTest {
    public static void main(String[] args) {
        Child402 c = new Child402();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface.staticMethod();
        Parent402 p2 = new Child402();
        p2.method1();

    }
}
