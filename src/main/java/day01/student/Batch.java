package day01.student;

import java.util.ArrayList;
import java.util.List;

public class Batch<B extends Student> {

    private String name;
    private List<B> studentsList;

    public Batch(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<B> getStudentList() {
        return studentsList;
    }

    public void addStudent(B student) {
        studentsList.add(student);
    }
}
