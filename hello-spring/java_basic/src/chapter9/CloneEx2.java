package chapter9;

import java.util.Arrays;

public class CloneEx2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));

        int[] arrClone2 = new int[arr.length]; //배열생성
        System.arraycopy(arr,0,arrClone2,0,arr.length); //내용을 복사
        System.out.println(Arrays.toString(arrClone2));

    }
}
