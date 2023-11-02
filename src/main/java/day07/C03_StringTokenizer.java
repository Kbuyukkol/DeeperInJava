package day07;

import java.util.StringTokenizer;

public class C03_StringTokenizer {

    public static void main(String[] args) {

        StringTokenizer str = new StringTokenizer("mens sana in corpore sano", " ");

        while (str.hasMoreTokens())

            System.out.println(str.nextToken());


    }
}
