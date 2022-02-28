package chapter8;

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}


public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            e.printStackTrace();
            System.out.println("공간을 늘리고 다시 설치하세요");
            System.out.println(e.getMessage());
        } catch (MemoryException e) {
            e.printStackTrace();
            System.out.println("메모리 늘리고 다시 설치하세요");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
            throw new SpaceException("설치공간 부족");
        if(!enoughMemory())
            throw new MemoryException("메모리 부족");
    }

    static void copyFiles() {
        System.out.println("파일 복사");
    }
    static void deleteTempFiles(){
        System.out.println("임시파일 삭제");
    }

    static boolean enoughSpace() {
        return true;
    }

    static boolean enoughMemory() {
        return false;
    }


}
