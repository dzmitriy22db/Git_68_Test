package app;

public class Car implements Vehicle {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void drive(){
        System.out.println(name + " начинай движение ");
    }
    @Override
    public void stop(){
        System.out.println(name + " остановись!!! ");

    }
}
