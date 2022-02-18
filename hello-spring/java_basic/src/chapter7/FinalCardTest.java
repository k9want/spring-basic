package chapter7;

class Card7 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card7(int number, String kind) {
        NUMBER = number;
        KIND = kind;
    }

    Card7() {
        this(7, "CLOVER");
    }

    public String toString() {
        return KIND + NUMBER;
    }
}
public class FinalCardTest {
    public static void main(String[] args) {
        Card7 c = new Card7();
        System.out.println(c.toString());

        Card7 c2 = new Card7();
        //에러나는 이유 final 변수인데 즉 상수인데, 이미 생성자를 통해 초기화를 했기때문에 추가적으로 값을 변경할 수 없다.
        //c2.NUMBER = 5;

    }

}
