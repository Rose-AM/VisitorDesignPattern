package org.example.Shapes;

import org.example.Visitor.Visitor;

public interface Shape {
    void accept(Visitor v);
}
