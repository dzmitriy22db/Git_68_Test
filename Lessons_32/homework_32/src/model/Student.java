package model;

public class Student {
    private int id;
    private String name;
    private String group;
    private static int counter = 0;


    public Student(String name, String group){
        this.name = name;
        this.group = group;
        counter ++;
        id = counter;

    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public static int getStudentCount(){
        return counter;

    }
}
