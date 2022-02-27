package chapter8;

import java.io.File;
import java.io.IOException;

public class ExceptionEx15 {
    public static void main(String[] args) {
        try {
            File f = createFile("");
            System.out.println(f.getName() + "파일이 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시 입력해주세요");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
