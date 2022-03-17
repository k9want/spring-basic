package chapter14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

class StudentEx7 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public StudentEx7(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentEx7{" +
                "name='" + name + '\'' +
                ", isMale=" + (isMale ? "남":"여") +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    enum Level { HIGH, MID, LOW }

}
public class StreamEx7 {
    public static void main(String[] args) {
        StudentEx7[] stuArr = {
                new StudentEx7("일자바", true, 1,1,100),
                new StudentEx7("이자바", false, 1,1,300),
                new StudentEx7("삼자바", true, 1,1,250),
                new StudentEx7("사자바", false, 1,2,200),
                new StudentEx7("오자바", true, 1,2,100),
                new StudentEx7("육자바", false, 1,2,50),
                new StudentEx7("칠자바", false, 1,3,100),
                new StudentEx7("팔자바", false, 1,3,150),
                new StudentEx7("구자바", true, 1,3,200),

                new StudentEx7("일자바", true, 2,1,100),
                new StudentEx7("이자바", false, 2,1,300),
                new StudentEx7("삼자바", true, 2,1,250),
                new StudentEx7("사자바", false, 2,2,200),
                new StudentEx7("오자바", true, 2,2,100),
                new StudentEx7("육자바", false, 2,2,50),
                new StudentEx7("칠자바", false, 2,3,100),
                new StudentEx7("팔자바", false, 2,3,150),
                new StudentEx7("구자바", true, 2,3,200),
        };

        System.out.println("1. 단순분할(성별로");
        Map<Boolean, List<StudentEx7>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(StudentEx7::isMale));

        List<StudentEx7> maleStudent = stuBySex.get(true);
        List<StudentEx7> femaleStudent = stuBySex.get(false);

        for(StudentEx7 s : maleStudent) System.out.println(s);
        for(StudentEx7 s : femaleStudent) System.out.println(s);

        System.out.println("\n 단순분할 + 통계(성별 학생수)");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(StudentEx7::isMale, counting()));

        System.out.println("stuNumBySex.get(true) = " + stuNumBySex.get(true));
        System.out.println("stuNumBySex.get(true) = " + stuNumBySex.get(false));

        System.out.println("\n 단순부날 + 통계(성별 1등)");
        Map<Boolean, Optional<StudentEx7>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(StudentEx7::isMale, maxBy(Comparator.comparingInt(StudentEx7::getScore))));

        System.out.println("stuNumBySex.get(true) = " + topScoreBySex.get(true));
        System.out.println("stuNumBySex.get(false) = " + topScoreBySex.get(false));

        Map<Boolean, StudentEx7> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(StudentEx7::isMale,
                        collectingAndThen(
                                maxBy(Comparator.comparingInt(StudentEx7::getScore)), Optional::get)));

        System.out.println("topScoreBySex2.get(true) = " + topScoreBySex2.get(true));
        System.out.println("topScoreBySex2.get(false) = " + topScoreBySex2.get(false));

        System.out.println("\n 다중분할(성별 불합격자, 100점이하");

        Map<Boolean, Map<Boolean, List<StudentEx7>>> failedStuBySex =
                Stream.of(stuArr)
                        .collect(partitioningBy(StudentEx7::isMale, partitioningBy(s -> s.getScore() <= 50)));

        List<StudentEx7> failedMaleStu = failedStuBySex.get(true).get(true);
        List<StudentEx7> failedFemaleStu = failedStuBySex.get(false).get(true);

        for (StudentEx7 s : failedMaleStu) {
            System.out.println(s);
        }

        for (StudentEx7 s : failedFemaleStu) {
            System.out.println(s);
        }

    }
}
