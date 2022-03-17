package chapter14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx8 {
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

        System.out.println(" 단순그룹화(반별로 그룹화)");
        Map<Integer, List<StudentEx7>> stuByBan = Stream.of(stuArr)
                .collect(Collectors.groupingBy(StudentEx7::getBan));

        for (List<StudentEx7> ban : stuByBan.values()) {
            for (StudentEx7 s : ban) {
                System.out.println(s);
            }
        }

        System.out.println("\n 단순그룹화 성적별로 그룹화");
        Map<StudentEx7.Level, List<StudentEx7>> stuByLevel = Stream.of(stuArr)
                .collect(Collectors.groupingBy(s -> {
                    if (s.getScore() >= 200) return StudentEx7.Level.HIGH;
                    else if (s.getScore() >= 100) return StudentEx7.Level.MID;
                    else return StudentEx7.Level.LOW;
                }));

        TreeSet<StudentEx7.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for (StudentEx7.Level key : keySet) {
            System.out.println("key = " + key);

            for (StudentEx7 s : stuByLevel.get(key)) {
                System.out.println(s);
            }
            System.out.println();
        }

        System.out.println("\n 단순그룹화 + 통계(성적별 학생수)");
        Map<StudentEx7.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(Collectors.groupingBy(s -> {
                    if (s.getScore() >= 200) return StudentEx7.Level.HIGH;
                    else if (s.getScore() >= 100) return StudentEx7.Level.MID;
                    else return StudentEx7.Level.LOW;
                }, Collectors.counting()));

        for (StudentEx7.Level key : stuCntByLevel.keySet()) {
            System.out.println("key + stuCntByLevel.get(key) = " + key + stuCntByLevel.get(key));
        }
        System.out.println();

        for (List<StudentEx7> level : stuByLevel.values()) {
            System.out.println();
            for (StudentEx7 s : level) {
                System.out.println(s);
            }
        }

        System.out.println("\n 다중그룹화(학년별, 반별");
        Map<Integer, Map<Integer, List<StudentEx7>>> stuByHakAndBan = Stream.of(stuArr)
                .collect(Collectors.groupingBy(StudentEx7::getHak, Collectors.groupingBy(StudentEx7::getBan)));
        for (Map<Integer, List<StudentEx7>> hak : stuByHakAndBan.values()) {
            for (List<StudentEx7> ban : hak.values()) {
                System.out.println();
                for (StudentEx7 s : ban) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("\n 다중그룹화 + 통계(학년별, 반별 1등)");
        Map<Integer, Map<Integer, StudentEx7>> topStuByHakAndBan = Stream.of(stuArr)
                .collect(Collectors.groupingBy(StudentEx7::getHak,
                        Collectors.groupingBy(StudentEx7::getBan,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparingInt(StudentEx7::getScore))
                                        , Optional::get
                                )
                        )));

        for (Map<Integer, StudentEx7> ban : topStuByHakAndBan.values()) {
            for (StudentEx7 s : ban.values()) {
                System.out.println(s);
            }
        }

        System.out.println("\n 다중그룹화 + 통계(학년별, 반별 성적그룹)");
        Map<String, Set<StudentEx7.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(Collectors.groupingBy(s -> s.getHak() + "-" + s.getBan(),
                        Collectors.mapping(s -> {
                            if (s.getScore() >= 200) return StudentEx7.Level.HIGH;
                            else if (s.getScore() >= 100) return StudentEx7.Level.MID;
                            else return StudentEx7.Level.LOW;
                        }, Collectors.toSet())));

        Set<String> keySet2 = stuByScoreGroup.keySet();
        for (String key : keySet2) {
            System.out.println(key + " " + stuByScoreGroup.get(key));
        }

    }
}

