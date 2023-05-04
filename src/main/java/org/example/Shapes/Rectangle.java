package org.example.Shapes;

import org.example.Visitor.Visitor;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width  = width;
        this.height = height;
    }

    //getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor v) {

    }
}
