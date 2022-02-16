package chapter6;

public class StaticBlockTest {
     static int[] arr = new int[10];

    //static 키워드 없애면 인스턴스 초기화 블럭
    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
