import java.util.Scanner;

class ScannerEx {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.printf("두 자리 정수를 하나 입력하시오.>");
          String input = scanner.nextLine();
          int num = Integer.parseInt(input);

          System.out.println("입력내용" + input);
          System.out.printf("num=%d", num);
     }
}
