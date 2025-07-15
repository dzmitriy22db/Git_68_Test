package app;

import java.util.List;
import java.util.Objects;

public class Programmer {
    private String name;
    private List<Task> tasks;

    public Programmer(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(name, that.name) && Objects.equals(tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
