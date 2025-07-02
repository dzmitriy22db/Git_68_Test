/*
Создайте интерфейс Vehicle с методами drive(), stop(). Реализуйте этот интерфейс в классах Car, Boat, Bike.
 */


package app;

public class Main {
    public static void main(String[] args) {
    Vehicle myCar = new Car("Car: ");
    myCar.drive();
    myCar.stop();

    Vehicle myBike = new Bike("Bike: ");
    myBike.drive();
    myBike.stop();

    Vehicle myBoat = new Boat("Boat: ");
    myBoat.drive();
    myBoat.stop();

    }



}
