package chapter14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("일자바", 3,200),
                new Student("이자바", 1,100),
                new Student("삼자바", 2,190),
                new Student("사자바", 2,110),
                new Student("오자바", 1,120),
                new Student("육자바", 3,300),
                new Student("칠자바", 3,250),
                new Student("팔자바", 1,150),
        };

        Stream<Student> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        stuStream = Stream.of(stuArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println(stat.getCount());
        System.out.println(stat.getSum());
        System.out.println(stat.getMin());
        System.out.println(stat.getMax());
    }
}

class Student implements Comparable<Student> {
    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    String name;
    int ban;
    int totalScore;

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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}