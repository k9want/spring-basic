package chapter6;

import java.util.Arrays;

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 현재 채널: " + t1.channel);
        System.out.println("t2 현재 채널: " + t2.channel);
        t1.channel = 7;
        System.out.println("t1 현재 채널: " + t1.channel);
        System.out.println("t2 현재 채널: " + t2.channel);
        
        int[] numArr = new int[3];
        numArr[0] = 1;
        System.out.println("numArr = " + numArr[0]);
        Tv[] arr = new Tv[3];
        arr[0] = new Tv();
        System.out.println("arr[0].channel = " + arr[0].channel);

        Tv[] tvArr = {new Tv(), new Tv()};
        tvArr[0].channel = 7;
        System.out.println(tvArr[0].channel);
        System.out.println(tvArr[1].channel);
    }
}
