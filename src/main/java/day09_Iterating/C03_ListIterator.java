package day09_Iterating;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");

        ListIterator<String> listIterator = countries.listIterator();


        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("-----------------------");

        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }




    }
}
