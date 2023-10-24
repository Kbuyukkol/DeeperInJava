package day03;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExamples {

    public static void main(String[] args) {

        Consumer<Integer> print= n-> System.out.println(n);
        print.accept(10);

        Consumer<Integer> print2= System.out::println;
        print.accept(10);

        Function<String ,String> toLower = str-> str.toLowerCase();
        System.out.println(toLower.apply("JAVA"));

        Function<String ,String> toLower2 = String::toLowerCase;
        System.out.println(toLower.apply("JAVA"));

        Supplier<Double> ransomNum = ()-> Math.random();
        System.out.println(ransomNum.get());

        Supplier<Double> ransomNum2 = Math::random;
        System.out.println(ransomNum.get());

        BiFunction<String, Integer, String> sub = (str, i) -> str.substring(i);
        System.out.println(sub.apply("friday", 3));

        BiFunction<String, Integer, String> sub2 = String::substring;
        System.out.println(sub.apply("friday", 3));

    }
}
