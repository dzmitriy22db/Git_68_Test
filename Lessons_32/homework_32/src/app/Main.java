package app;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Student> student = new ArrayList<Student>();

    student.add(new Student("Alex", "B1"));
    student.add(new Student("Petya", "A2"));
    student.add(new Student("Roma", "C3"));
    student.add(new Student("Ivan", "S5"));

        System.out.println("Студенты: ");
        for (Student students : student){
            System.out.println(students);
        }


    }
}
