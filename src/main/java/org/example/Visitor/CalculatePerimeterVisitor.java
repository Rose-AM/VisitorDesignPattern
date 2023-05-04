package org.example.Visitor;

import org.example.Shapes.Circle;
import org.example.Shapes.Rectangle;

public class CalculatePerimeterVisitor implements Visitor{
    private double perimeter = 0;

    //calculate perimeter of circle
    @Override
    public void visit(Circle c) {
        perimeter = perimeter + (2 * (Math.PI * c.getRadius()));
    }

    //calculate perimeter of rectangle
    @Override
    public void visit(Rectangle r) {
        perimeter = perimeter + (2 * (r.getHeight() + r.getWidth()));
    }

    //get calculated perimeter
    public double getPerimeter() {
        return perimeter;
    }
}
