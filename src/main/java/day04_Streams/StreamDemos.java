package day04_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemos {

    public static void main(String[] args) {

        int[] arr = {3, 5, 4, 8, 7};

        System.out.println(Arrays.stream(arr));

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 3, 7, 7, 8, 8, 1));

        System.out.println(list.stream());

        //distinct

        System.out.println(list.stream().distinct().toList());

        list.stream().distinct().forEach(System.out::println);

        //filter

        list.stream().filter(p -> p % 2 == 0).forEach(System.out::println);

        list.stream()
                .distinct()
                .filter(p -> p % 2 == 0)
                .forEach(System.out::println);

        //limit

        list.stream().limit(3).forEach(System.out::println);

        System.out.println("-----------------");

        list.stream()
                .filter(p -> p < 4)
                .limit(4)
                .forEach(System.out::println);

        System.out.println("-----------------");

        //skip

        list.stream().skip(2).forEach(System.out::println);

        System.out.println("-----------------");

        //map
        list.stream().map(p -> p * 3).forEach(System.out::println);

        System.out.println("-----------------");
        list.stream()
                .limit(5)
                .distinct()
                .map(p -> p * p).forEach(System.out::println);

        System.out.println("-----------------");

        //sorted
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------");

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }


}
