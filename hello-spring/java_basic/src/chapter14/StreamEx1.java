package chapter14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<StudentForStream> studentStream = Stream.of(
                new StudentForStream("일자바", 3, 200),
                new StudentForStream("이자바", 2, 400),
                new StudentForStream("삼자바", 2, 100),
                new StudentForStream("사자바", 3, 230),
                new StudentForStream("오자바", 1, 400)
                ) ;
        studentStream.sorted(Comparator.comparing(StudentForStream::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }

}

class StudentForStream implements Comparable<StudentForStream> {

    String name;
    int ban;
    int totalScore;

    public StudentForStream(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "StudentForStream{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(StudentForStream s) {
        return s.totalScore - this.totalScore;
    }
}
