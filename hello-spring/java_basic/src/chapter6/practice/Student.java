package chapter6.practice;

public class Student {
    String name; //학생이름
    int ban; //반
    int no; //번호
    int kor; //국어점수
    int eng; //영어점수
    int math; //수학점수

    public Student() {}

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
//        System.out.println("국영수 점수합 : " + kor + eng + math);
        return kor + eng + math;
    }

    float getAverage() {
        return ( getTotal() / 3f );
    }

    String info() {
        return name +","+ban+","+no;
    }

}
