package chapter6;

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "클로버";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "하트";
        c2.number = 10;

        System.out.println("c2.width = " + c2.width);
        System.out.println("c1.width = " + c1.width);
        c1.width = 30;
//        static 변수 -> 클래스변수를 바꿀때는 클래스.클래스변수가 좋다.
        Card.height = 10;
        System.out.println("c2.width = " + c2.width);
        System.out.println("c1.height = " + c1.height);
    }
}
