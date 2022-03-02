package chapter8;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    static void copyFiles() {
        System.out.println("copy files");
    }
    static void deleteTempFiles() {
        System.out.println("delete tempfiles");
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }

    static void startInstall() throws SpaceException {
        if (!enoughSpace()) {
            throw new SpaceException("공간 부족");
        }

        if (!enoughMemory()) {
//            throw new MemoryException("메모리 부족");
            throw new RuntimeException(new MemoryException("메모리 부족"));
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        }
        finally {
            deleteTempFiles();
        }
    }


    static class InstallException extends Exception {
        InstallException(String msg) {
            super(msg);
        }

    }


}
