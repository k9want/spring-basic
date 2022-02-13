package chapter6;

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 현재 채널: " + t1.channel);
        System.out.println("t2 현재 채널: " + t2.channel);
        t1.channel = 7;
        System.out.println("t1 현재 채널: " + t1.channel);
        System.out.println("t2 현재 채널: " + t2.channel);

    }
}
