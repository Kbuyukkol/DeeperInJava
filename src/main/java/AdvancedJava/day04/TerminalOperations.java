package AdvancedJava.day04;

import java.util.Arrays;

public class TerminalOperations {
    public static void main(String[] args) {

        String[] names = {"Val", "Betul", "Ercan", "Nihan", "Huong"};
        Arrays.stream(names)
                .filter(p -> p.contains("a"))
                .forEach(System.out::println);

        System.out.println(Arrays.stream(names)
                .filter(p -> p.contains("a"))
                .count()); // count returns a long for the number of elements - it stops the Stream

        System.out.println("Mini task for unique characters");
        // Given a String count the number of unique character in the String
        String str = "aaaaaaabbbbbbcccccddddddeeeefffffaaaabbbbccddd";

        System.out.println(str.chars()
                .distinct()
                .count());


        str.chars()
                .mapToObj(a -> (char)a)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\t\t All Match");
        int[] nums = {4, 5, 15, 20, 19, 7};
        System.out.println(Arrays.stream(nums)
                .allMatch(p -> p < 30));
        System.out.println("\t\t Any Match");
        System.out.println(Arrays.stream(nums)
                .anyMatch(p -> p % 5 == 0));
        System.out.println(Arrays.stream(nums)
                .anyMatch(p -> p % 50 == 0));

        System.out.println("\t\t none Match");
        System.out.println(Arrays.stream(nums)
                .noneMatch(p -> p % 50 == 0));

    }
}
