package chapter14;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("get()을 사용하지 않으면 저장된 값을 꺼내지 않기 때문에 값이 출력되지 않는다.");
        System.out.println("optInt = " + optInt);
        System.out.println("optInt.get() = " + optInt.get());
        System.out.println("optStr = " + optStr);
        System.out.println("optStr = " + optStr.get());


        Integer result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();

        System.out.println("\norElse를 쓰지 않는 경우 예외 발생");
        Integer result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.println("result3 = " + x));

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();
        System.out.println("optInt1.isPresent() = " + optInt1.isPresent());
        System.out.println("optInt2.isPresent() = " + optInt2.isPresent());

        System.out.println(optInt1.getAsInt());
        System.out.println(optInt2.orElse(-1));

        System.out.println("\ngetAsInt()를 사용하지 않을 경우");
        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);

        System.out.println("\nOptionalInt에서 of와 empty는 서로 다르다.");
        System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));


        optStrToInt(Optional.of("123"), 0);

        System.out.println("\noptStrToInt() 사용");
        int result3 = optStrToInt(Optional.of("123"), 0);
        int result4 = optStrToInt(Optional.of(""), 0);

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    static int optStrToInt(Optional<String> optStr, int defaultValue) {
        try {
            return optStr.map(Integer::parseInt).get();
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
