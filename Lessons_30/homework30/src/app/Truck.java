package app;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String number, String brand, int year, double loadCapacity){
        super(number, brand, year);
        this.loadCapacity = loadCapacity;


    }
    public void drive(){
        super.drive();
        System.out.println("Грузоподъемность состовляет: " + loadCapacity + " тонн");

    }
}
