package chapter6;

class BlockTest {
    static {
        System.out.println("클래스 초기화 블럭 - static { }");
    }

    {
        System.out.println("인스턴스 초기화 블럭 - { }");
    }
    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("초기화 블럭 테스트");
        BlockTest bt1 = new BlockTest();

    }

}
