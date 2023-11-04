package day09_Iterating;

import java.util.Arrays;
import java.util.List;

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


    }
}
