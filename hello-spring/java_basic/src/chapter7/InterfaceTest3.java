package chapter7;

interface I3 {
    public abstract void methodB();
}

class B3 implements I3 {

    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }

    public String toString() {
        return "B class";
    }
}

class InstanceManager {
    public static I3 getInstance() {
        return new B3();
    }
}


class A3 {
    void methodA() {
        I3 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}
