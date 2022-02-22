package chapter7;

class Outer5 {
    int value = 10; //Outer.this.value

    class Inner5 {
        int value = 20; // this.value

        void method() {
            int value = 30;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("Outer5.this.value = " + Outer5.this.value);
        }
    }
}

public class InnerEx5 {
    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
        Outer5.Inner5 inner5 = outer5.new Inner5();
        inner5.method();

    }
}
