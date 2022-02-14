package chapter6;

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 5;
        }

        for (int i = 0; i < tvArr.length; i++) {
            for (int j = 0; j < i; j++) {
            tvArr[i].channelDown();
            }
        }

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println("tvArr = " + tvArr[i].channel);
        }
    }
}
