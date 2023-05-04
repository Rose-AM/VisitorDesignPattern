package org.example;

import org.example.Shapes.Circle;
import org.example.Shapes.Rectangle;
import org.example.Shapes.Shape;
import org.example.Visitor.CalculateAreaVisitor;
import org.example.Visitor.CalculatePerimeterVisitor;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);

        CalculateAreaVisitor calculateAreaVisitor = new CalculateAreaVisitor();
        CalculatePerimeterVisitor calculatePerimeterVisitor =  new CalculatePerimeterVisitor();

        //using visitor to calculate the area & perimeter of circle
        circle.accept(calculateAreaVisitor);
        circle.accept(calculatePerimeterVisitor);

        //get area of circle
        System.out.println("Area of the circle is:" + calculateAreaVisitor.getArea());
        System.out.println("Perimeter of the circle is:" + calculatePerimeterVisitor.getPerimeter());


    }
}