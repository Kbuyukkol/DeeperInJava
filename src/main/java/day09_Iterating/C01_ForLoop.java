package day09_Iterating;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class C01_ForLoop {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        System.out.println("--------Enhanced Loop---------");

        for (String country : countries) {
            System.out.println(country);
        }

        System.out.println("--------Enhanced Loop:Array ---------");
        //Array
        String[] countries2 = {"Germany", "Panama", "Australia"};

        for (String country : countries2) {
            System.out.println(country);
        }

        System.out.println("--------Enhanced Loop:Set ---------");
        Set<String> countries3 = new LinkedHashSet<>(Arrays.asList("Germany", "Panama", "Australia"));
        for (String country : countries3) {
            System.out.println(country);
        }


    }
}
