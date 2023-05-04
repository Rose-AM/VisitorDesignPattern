package org.example.Shapes;

import org.example.Visitor.Visitor;

public class Circle implements Shape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    //getter for radius of Circle
    public double getRadius() {
        return radius;
    }

    //insert visitor
    public void accept(Visitor v) {
        v.visit(this);
    }
}
