package day01.student;

public class TrainingSchool {

    public static void main(String[] args) {

        //unprotected type
        Batch b5 = new Batch("B5");
        b5.addStudent(new SdetStudent("Eren"));
        b5.addStudent(new SdetStudent("Salma"));
        b5.addStudent(new SdetStudent("Eduard"));
        b5.addStudent(new SdetStudent("Kamuran"));
        b5.addStudent(new SdetStudent("Val"));
        b5.addStudent(new DevStudent("James"));
        b5.addStudent(new DevStudent("Anna"));
        b5.addStudent(new CyberSecurityStudent("Kelly"));

        //protect the type by using the generic
        Batch<SdetStudent> b6 = new Batch<>("B6");
        b6.addStudent(new SdetStudent("Eren"));
        b6.addStudent(new SdetStudent("Salma"));
        b6.addStudent(new SdetStudent("Eduard"));
        b6.addStudent(new SdetStudent("Kamuran"));
        b6.addStudent(new SdetStudent("Val"));
//        b6.addStudent(new DevStudent("James"));
//        b6.addStudent(new DevStudent("Anna"));
//        b6.addStudent(new CyberSecurityStudent("Kelly"));

        Batch<CyberSecurityStudent> cB6 = new Batch<>("B6");
        cB6.addStudent(new CyberSecurityStudent("Jen"));
        cB6.addStudent(new CyberSecurityStudent("Lena"));




    }
}
