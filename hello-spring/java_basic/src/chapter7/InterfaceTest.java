package chapter7;

//직접적인 관계인 두 클래스를 인터페이스를 이용해서 간접적인 관계로 바꾸기 (인터페이스를 이용해서 선언과 구현을 분리한다.)
interface I {
    public abstract void methodB();
}

class A {
    public static void methodA(I i) {
        i.methodB();
    }
}

class B implements I {
    public void methodB() {
        System.out.println("methodB()");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }

}
