package day07_String;

import java.io.StringWriter;

public class C06_StringWriter {

    public static void main(String[] args) {

        String motto = "Mater semper certa est";

        StringWriter output = new StringWriter();

        try {

            output.write(motto);

            System.out.println("Data in the StringWriter: " + output);

            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
