package app;

public class Bus extends Vehicle {
    private int numberOfPassenger;

    public Bus (String number, String brand, int year, int numberOfPassenger){
        super(number, brand, year);
        this.numberOfPassenger = numberOfPassenger;

}
public void drive(){
        super.drive();
    System.out.println("Количество пассажиров: " + numberOfPassenger + " человек" );
}
}