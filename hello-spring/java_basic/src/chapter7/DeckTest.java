package chapter7;
class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";
        return kinds[this.kind] +" "+ numbers.charAt(this.number);
    }

}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {
        int i = 0;

        for (int k = 1; k < Card.KIND_MAX+1; k++) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
//                System.out.println(k);
                cardArr[i++] = new Card(k,n+1);
            }
        }
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return cardArr[index];
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            Card tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;

        }
    }

}
public class DeckTest {
    public static void main(String[] args) {

        Deck d = new Deck();
        Card c = d.pick();
        System.out.println(c);

        d.shuffle();
        c = d.pick(15);
        System.out.println(c.toString());
    }

}
