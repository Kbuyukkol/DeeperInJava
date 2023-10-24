package day03;

import java.util.*;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 2, 1, 6, 21, 5, 2, 10, 14));
        nums.forEach(System.out::println);

        Collections.sort(nums);
        nums.forEach(System.out::println);

        Collections.sort(nums, (n1, n2) -> n1 > n2 ? -1 : n1 < n2 ? 1 : 0);
        nums.forEach(System.out::println);

        Collections.shuffle(nums);
        //Collections.sort(nums,(n1,n2)-> n1.compareTo(n2));
        nums.sort((n1, n2) -> n1.compareTo(n2));

        nums.forEach(System.out::println);

        Collections.shuffle(nums);
        //Collections.sort(nums,(n1,n2)-> n2.compareTo(n1));
        nums.sort((n1, n2) -> n2.compareTo(n1));
        nums.forEach(System.out::println);


        Collections.shuffle(nums);
        nums.sort(Comparator.reverseOrder());
        nums.forEach(System.out::println);


    }
}
