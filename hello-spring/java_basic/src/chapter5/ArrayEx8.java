package chapter5;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }

        int tmp = 0;
        int n = 0;

        for (int i = 0; i < 6; i++) {
            n = (int) (Math.random() * 45);

            tmp = ball[i];
            ball[i] = ball[n];
            ball[n] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+"번째 공: " + ball[i]);
        }
    }
}
