package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class C04_StringJoiner {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("mens");
        arr.add("sana");
        arr.add("in");
        arr.add("corpore");
        arr.add("sano");

        StringJoiner str = new StringJoiner(" ");

        str.add(arr.get(0)).add(arr.get(1)).add(arr.get(2)).add(arr.get(3)).add(arr.get(4));

        System.out.println(str);


    }
}
