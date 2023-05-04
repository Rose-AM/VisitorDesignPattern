package org.example.Visitor;

import org.example.Shapes.Circle;
import org.example.Shapes.Rectangle;

public class CalculateAreaVisitor implements Visitor{
    private double area = 0;

    //calculate area of circle
    @Override
    public void visit(Circle c){
        area = area + (Math.PI * (c.getRadius() * c.getRadius()) );
    }

    //calculate area of rectangle
    @Override
    public void visit(Rectangle r) {
        area = area + (r.getWidth() * r.getHeight());
    }

    //get calculated area
    public double getArea(){
        return area;
    }
}
