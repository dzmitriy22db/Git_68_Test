package app;

import java.util.ArrayList;
import java.util.List;

public class Manager<T extends Employee> {
    List<T> team = new ArrayList<>();

    public void addToTeam(T employee){
        team.add(employee);
    }

    public void printTeam(){
        for (T employee : team){
            System.out.println(employee);
        }
    }


}
