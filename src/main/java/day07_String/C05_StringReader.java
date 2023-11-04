package day07_String;

import java.io.IOException;
import java.io.StringReader;

public class C05_StringReader {

    public static void main(String[] args) {

        String sentence = "faber est suae quisque fortunae";

        char[] chars = new char[sentence.length()];
        StringReader input = new StringReader(sentence);


        try {

            input.read(chars);
            System.out.println("Data read from the string:");
            System.out.println(chars);

            input.close();
        } catch (IOException e) {
            e.getStackTrace();
        }


    }
}
