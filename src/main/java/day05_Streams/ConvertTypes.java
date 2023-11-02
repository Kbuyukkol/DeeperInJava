package day05_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertTypes {

    public static void main(String[] args) {

        // convert from int[] to List<Integer>

        int[] nums = {3, 4, 5, 2, 6, 1};
        List<Integer> list = Arrays.stream(nums)
                .boxed()        // boxed method converts the IntStream to a Stream<Integer>
                .collect(Collectors.toList());



        // convert List<Integer> to int[]

        List<Integer> listNums = List.of(3, 4, 32, 5, 1, 23, 123, 3);

        int[] arr2 = listNums.stream().mapToInt(n -> n).toArray();

        System.out.println(Arrays.toString(arr2));

        System.out.println();

        IntStream.range(1, 30).forEach(System.out::println);


    }
}
