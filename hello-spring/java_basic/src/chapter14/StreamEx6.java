package chapter14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("일자바", 3,200),
                new Student("이자바", 1,100),
                new Student("삼자바", 2,190),
                new Student("사자바", 2,110),
        };

        List<String> names = Stream.of(stuArr).map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("리스트");
        System.out.println(names);

        //스트림 -> 배열로 변환
        Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);

        System.out.println();
        for(Student s : stuArr2)
            System.out.println(s);

        //스트림 -> Map<String, Student> 변환 키는 학생이름
        Map<String, Student> stuMap = Stream.of(stuArr)
                .collect(Collectors.toMap(s -> s.getName(), p -> p));

        System.out.println("\nMap // stuMap.get(name)");
        for(String name : stuMap.keySet())
            System.out.println(stuMap.get(name));

        long count = Stream.of(stuArr).collect(Collectors.counting());
        Integer totalScore = Stream.of(stuArr)
                .collect(Collectors.summingInt(Student::getTotalScore));

        System.out.println();
        System.out.println("count = " + count);
        System.out.println("totalScore = " + totalScore);

        totalScore = Stream.of(stuArr)
                .collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
        System.out.println("totalScore = " + totalScore);

        System.out.println();
        Optional<Student> topStudent = Stream.of(stuArr)
                .collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStudent.get() = " + topStudent.get());

        System.out.println();
        IntSummaryStatistics stat = Stream.of(stuArr)
                .collect(Collectors.summarizingInt(Student::getBan));
        System.out.println(stat);

        System.out.println();
        String stuNames = Stream.of(stuArr)
                .map(Student::getName)
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(stuNames);
    }
}
