package chapter7;

interface I2 {
    public abstract void play();
}

class B2 implements I2 {
    @Override
    public void play() {
        System.out.println("play B");
    }
}

class C2 implements I2 {
    @Override
    public void play() {
        System.out.println("play C");
    }
}

class A2 {
    void autoPlay(I2 i) {
        i.play();
    }
}


public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.autoPlay(new B2());
        a2.autoPlay(new C2());
    }
}
