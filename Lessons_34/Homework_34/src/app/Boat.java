package app;

public class Boat implements Vehicle{
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println(name + " начинай движение ");

    }

    @Override
    public void stop() {
        System.out.println(name + " остановись!!! ");

    }
}
