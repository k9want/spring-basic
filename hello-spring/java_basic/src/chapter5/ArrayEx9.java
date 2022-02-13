package chapter5;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int [] num = {-1,5,3,22,11,-9};
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * num.length);
            arr[i] = num[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
