package day09_Iterating;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C04_Java8_ForEach {

    public static void main(String[] args) {
        /*
Since Java 8, we can use the forEach() method to iterate over the elements of a list.
This method is defined in the Iterable interface, and can accept Lambda expressions as a parameter.

         */

        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");

        countries.forEach(p-> System.out.println(p));

        System.out.println("--------------------------");

        countries.forEach(System.out::println);

        System.out.println("--------------------------");

        //We can also convert a collection of values to a Stream,
        // and have access to operations such as forEach(), map(), and filter().

        countries.stream().forEach((c) -> System.out.println(c));

        System.out.println("--------------------------");

        Map<String, Integer> workers = new HashMap<>();
        workers.put("Aygun", 95);
        workers.put("Maria", 90);

        workers.forEach((k, v) -> System.out.println((k + ":" + v)));
        workers.forEach((k, v) -> System.out.println((k)));
        workers.forEach((k, v) -> System.out.println((v)));



    }
}
