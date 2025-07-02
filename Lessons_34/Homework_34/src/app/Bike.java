package app;

public class Bike implements Vehicle{
    private String name;
    public Bike(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println(name + " начинай движение ");

    }

    @Override
    public void stop() {
        System.out.println(name + " остановись!!! " );

    }

}
