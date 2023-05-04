package org.example.Visitor;

import org.example.Shapes.Circle;
import org.example.Shapes.Rectangle;

public interface Visitor {
    void visit(Circle c);
    void visit(Rectangle r);
}
