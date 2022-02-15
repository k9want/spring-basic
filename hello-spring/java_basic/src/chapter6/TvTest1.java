package chapter6;

class TvTest1 {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        System.out.println("현재 채널 " + t.channel);
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널 " + t.channel);
        t.tvIntroduce();
        Tv.introduce();
        t.color = "white";
        t.tvIntroduce();
    }
}