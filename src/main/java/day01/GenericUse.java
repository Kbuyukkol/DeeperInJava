package day01;

import java.util.ArrayList;
import java.util.List;

public class GenericUse {

    public static void main(String[] args) {

        List things= new ArrayList();
        things.add("java");
        things.add(null);
        things.add(3);
        things.add(3.14);

        System.out.println(things);

        List<String> list1 = new ArrayList<>();
        list1.add("hi");
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);






    }
}
