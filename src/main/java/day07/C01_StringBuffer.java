package day07;

public class C01_StringBuffer {

    /*
    StringBuffer is a class that represents a mutable sequence of characters
    StringBuffer objects are thread-safe, which means multiple threads can access it simultaneously
     */

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();// with an initial capacity of 16
        /*
        If the number of characters increases from its current capacity,
        it increases the capacity by (old capacity * 2 +2).
        For instance, if your current capacity is 16, it will be (16*2)+2=34.
                 */
        System.out.println(str.capacity()); //16

        str.append("Java");

        System.out.println(str);

        System.out.println(str.capacity()); //16

        str.append("JavaJavaJavaJava");

        System.out.println(str.capacity()); //34

        StringBuffer str1 = new StringBuffer("JavaScript");

        System.out.println("str1 = " + str1);

        StringBuffer str2 = new StringBuffer(10);

        System.out.println("str2.capacity() = " + str2.capacity());

        System.out.println("-----------------StringBuffer Methods-------------------");


        //append : add characters, strings, or other objects to the end
        str2.append("Python");

        System.out.println("str2 = " + str2);

        //delete
        str2.delete(0, 3);

        System.out.println("str2 = " + str2); //hon

        //reverse
        str2.reverse();

        System.out.println("str2 = " + str2); //noh

        str2.append("ut");

        System.out.println("str2 = " + str2); //nohut

        //deleteCharAt
        str2.deleteCharAt(4);

        System.out.println("str2 = " + str2); //nohu

        //indexOf
        System.out.println(str2.indexOf("o"));

        //lastIndexOf
        System.out.println(str2.lastIndexOf("o"));

        //replace
        str2.replace(2, 4, "ter");

        System.out.println(str2); //noter

        str2.replace(1, 2, "eş");

        System.out.println(str2); //neşter

        System.out.println(str2.capacity()); //10

        str2.replace(0, 3, "parlamen");

        System.out.println(str2); //parlamenter

        //charAt
        System.out.println(str2.charAt(3));

        //length
        System.out.println(str2.length());

        //setLength
        str2.setLength(8);

        System.out.println(str2); //parlamen

        //setCharAt
        str2.setCharAt(0, 'f');

        System.out.println(str2); //farlamen

        str2.insert(5, "hel");

        System.out.println(str2); //farlahelmen


    }
}
