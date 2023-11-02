package day06_Optional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoIntStreams {

    public static void main(String[] args) {

        System.out.println("======= creating IntStream =======");
        IntStream nums1 = IntStream.range(0, 11);
        nums1.forEach(System.out::println);

        System.out.println("--------------------");

        IntStream nums2 = IntStream.of(5, 10, 15, 20);
        nums2.forEach(System.out::println);

        System.out.println("======= creating IntStream from intermediate operations =======");

        List<String> words = List.of("java", "Friday", "computer");
        List<Integer> numbers = List.of(3, 4, 15, 12, 5, 2);

        System.out.println("======= get a List of the lengths of the words =======");
        List<Integer> wordLengths = words.stream()
                .mapToInt(String::length)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(wordLengths);

        System.out.println("======= multiply all the number by 2 =======");
        List<Integer> multiOf2 = numbers.stream()
                .mapToInt(n -> n * 2)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(multiOf2);

        System.out.println("======= square each number and get the double back =======");
        List<Double> squared = numbers.stream()
                .mapToDouble(n -> n * n)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(squared);

        System.out.println("======= convert String to a IntStream =======");
        String str = "Friday";
        IntStream eachChar = str.chars();
        eachChar.forEach(System.out::println);

        str.chars()
                .mapToObj(c -> (char)c)
                .forEach(System.out::println);


    }
}
