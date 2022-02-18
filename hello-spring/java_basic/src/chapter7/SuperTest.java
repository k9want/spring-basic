package chapter7;

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();

        Child2 c2 = new Child2();
        c2.method();


    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

class Child2 extends Parent {
    int x =20;
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }

}