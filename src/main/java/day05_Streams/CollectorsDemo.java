package day05_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        System.out.println("====== toArray ======");
        Integer[] arr = {12, 3, 4, 5, 25, 5};

        arr = Arrays.stream(arr)
                .filter(p -> p % 5 == 0)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        System.out.println("====== toCollection ======");

        List<Integer> list = Arrays.stream(arr)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);

        System.out.println("====== toList ======");
        List<Integer> list2 = Arrays.stream(arr).collect(Collectors.toList());
        list2.addAll(Arrays.asList(3, 4, 5, 25, 5, 3, 2, 3));
        System.out.println(list2);

        System.out.println("====== toSet ======");
        Set<Integer> set = list2.stream()
                .map(n -> n * 2)
                .collect(Collectors.toSet());
        System.out.println(set);

    }



}
