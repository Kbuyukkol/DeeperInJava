package day07_String;

public class C02_StringBuilder {

    /*
    The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does.
    Instances of StringBuilder are not safe for use by multiple threads.
    If such synchronization is required then it is recommended that StringBuffer be used.
    The advantage of StringBuilder is faster performance.
     */

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder(); //initial capacity of 16 characters.

        System.out.println(str.capacity());

        str.append("Java");

        System.out.println(str);


        StringBuilder str1 = new StringBuilder("JavaScript");

        System.out.println("str1 = " + str1);

        StringBuilder str2 = new StringBuilder(10);

        System.out.println("str2.capacity() = " + str2.capacity());

        System.out.println("-----------------StringBuilder Methods-------------------");

        //append: add characters, strings, or other objects to the end
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
        str2.replace(2,4,"ter");

        System.out.println(str2); //noter

        str2.replace(1,2,"eş");

        System.out.println(str2); //neşter

        System.out.println(str2.capacity()); //10

        str2.replace(0,3,"parlamen");

        System.out.println(str2); //parlamenter

        //charAt
        System.out.println(str2.charAt(3));

        //length
        System.out.println(str2.length());

        //setLength
        str2.setLength(8);

        System.out.println(str2); //parlamen

        //setCharAt
        str2.setCharAt(0,'f');

        System.out.println(str2); //farlamen

        str2.insert(5,"hel");

        System.out.println(str2); //farlahelmen



    }


}
