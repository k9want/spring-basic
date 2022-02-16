package chapter6;

class Document {
    static int count;
    String name;

    static {
        System.out.println("기본값: " +count);
        count = 1;
    }

    Document() {
        this("제목없음"+ ++count );
    }

    Document(String name) {
        this.name = name;
        System.out.println(this.name + "문서 생성");
    }
}

public class DocumentTest {
    public static void main(String[] args) {
        System.out.println("명시적 초기화: "+Document.count);
        Document d1 = new Document();
        Document d2 = new Document("이름있는 ");
        Document d3 = new Document();
    }
}
