package app;

public class Square extends Shape {
    private double side;


    public Square(double side){
        this.side =  side;

    }

    public double getSide() {
        return side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + side +
                '}';
    }
    public double calcArea() {
        return side * side;
    }
}
