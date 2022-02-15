package chapter6;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    static int cv2 = new MemberCall().iv; //이렇게 객체를 생성해야 인스턴스변수를 사용할 수 있다.

    static void staticMethod1() {
        System.out.println(cv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        System.out.println(cv);
        new MemberCall().instanceMethod(); //이렇게 객체 생성후 가능
        }

    void instanceMethod2() {
        staticMethod2();
        staticMethod1();
        instanceMethod();
    }

    public static void main(String[] args) {
        staticMethod1();
        new MemberCall().instanceMethod();
        MemberCall mc = new MemberCall();
        mc.instanceMethod2();
    }
}



