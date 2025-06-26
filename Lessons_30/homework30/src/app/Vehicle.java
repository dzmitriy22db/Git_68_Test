package app;

public class Vehicle {
    private String number;
    private String brand;
    private int year;

public Vehicle(String number, String brand, int year){
    this.number = number;
    this.brand = brand;
    this.year = year;

}
public String getNumber(){
    return number;
}

public String getBrand(){
    return brand;
}

public int getYear(){
    return year;
}

public String toString(){
    return number + brand + year;
}
public void drive(){
    System.out.println("Транспорное средство с гос номером: " + number + " - может отправляться");

}


}
