package chapter9;

public class ClassEx1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Card c = new Card("HEART", 6);
        Card c2 = Card.class.newInstance();

        Class<? extends Card> cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
