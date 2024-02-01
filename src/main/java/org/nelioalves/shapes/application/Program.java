package org.nelioalves.shapes.application;

import org.nelioalves.shapes.model.entities.AbstractShape;
import org.nelioalves.shapes.model.entities.Circle;
import org.nelioalves.shapes.model.entities.Rectangle;
import org.nelioalves.shapes.model.enums.Color;

public class Program {

    public static void main(String[] args) {

        AbstractShape circle = new Circle(Color.BLACK, 2.0);
        AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + String.format("%.3f", circle.area()));
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", rectangle.area()));
    }
}
