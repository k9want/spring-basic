package chapter5;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int j = 0; j < numArr.length - 1; j++) {
            boolean change = false;


            for (int i = 0; i < numArr.length - 1 - j; i++) {
                if (numArr[i] > numArr[i + 1]) {
                    int tmp = numArr[i];
                    numArr[i] = numArr[i+1];
                    numArr[i+1] = tmp;

                    change = true;
                }
            }
            if(!change) break;

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);
            }
            System.out.println();
        }
    }
}
