package model;

import app.Circle;
import app.Rectangle;
import app.Shape;
import app.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Circle(4.2));
        shapes.add(new Rectangle(5.6, 8.9));
        shapes.add(new Square(3.2));

        System.out.println(" Суммма общей площади: " + totalArea(shapes));
    }
public static double totalArea(List<Shape> shapes){
        double sum = 0;
        for (Shape shape : shapes){
            sum+=shape.calcArea();
        }
        return sum;


}
}
