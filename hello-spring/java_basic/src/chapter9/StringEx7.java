package chapter9;

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf('.');

        String fileName = fullName.substring(0, index);

        String fileType = fullName.substring(index + 1, fullName.length());

        System.out.println("파일 이름 : " + fileName);
        System.out.println("파일 확장자 :" + fileType);
    }
}
