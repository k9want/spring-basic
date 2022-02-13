import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char result = regNo.charAt(7);

        switch (result) {
            case '1':
            case '3':
                switch (result) {
                    case '1':
                        System.out.println("2000년 이전에 출생한 남자입니다.");
                        break;
                    case '3':
                        System.out.println("2000년 이후에 출생한 남자입니다.");
                        break;
                }
                break;
            case '2':
            case '4':
                switch (result) {
                    case '2':
                        System.out.println("2000년 이전에 출생한 여자입니다. ");
                        break;
                    case '4':
                        System.out.println("2000년 이후에 출생한 여자입니다. ");

                }
                break;
            default:
                System.out.println("잘못된 주민번호입니다.");
        }
    }
}
