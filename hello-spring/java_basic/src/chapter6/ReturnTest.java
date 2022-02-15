package chapter6;

import java.util.Arrays;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] resultArr = new int[2];
        r.add(3, 5, resultArr);
        System.out.println(Arrays.toString(resultArr));

    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
        result[1] = a - b;
    }
}
