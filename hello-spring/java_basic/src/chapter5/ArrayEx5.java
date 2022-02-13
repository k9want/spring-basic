package chapter5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;

        int[] score = {100, 88, 90, 100, 100};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg =  sum /(float) score.length;

        System.out.println("총점 : "+ sum);
        System.out.println("평점 : " + avg);
    }
}
