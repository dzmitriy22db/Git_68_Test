/*
Дан список Programmer(String name,  List<Task>  tasks). Каждый программист  имеет список задач    Task (int Number, String description) . Напишите метод, который сформирует Map< Programmer, List<Task> > где ключ - программист, а значение список его задач.
 */


package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Task task1 =new Task(1, "....");
        Task task2 = new Task(2, "....");

        List<Task> taskForPetya =List.of(task1);
        List<Task> taskForJohn = List.of(task2);

        Programmer petya = new Programmer("Petya", taskForPetya);
        Programmer john = new Programmer("John", taskForJohn);

        List<Programmer> programmers = List.of(petya, john);

        Map<Programmer, List<Task>> map = buildMap(programmers);

        for(Programmer p: programmers){
            System.out.println(p.getName() + ": " + map.get(p));
        }




    }
    public static Map<Programmer, List<Task>> buildMap(List<Programmer> programmers){
        Map<Programmer, List<Task>> map = new HashMap<>();

        for (Programmer p: programmers){
            map.put(p, p.getTasks());
        }
        return (map);


    }
}
