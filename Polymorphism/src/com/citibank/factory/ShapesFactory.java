package com.citibank.factory;

import com.citibank.domain.Circle;
import com.citibank.domain.Lines;
import com.citibank.domain.Shapes;
import com.citibank.domain.Square;
import com.citibank.domain.Triangle;

public class ShapesFactory {
    
    public Shapes createShape(int choice){

        switch (choice) {
            case 1:
                return new Circle();
            case 2:
                return new Lines();
            case 3:
                return new Triangle();
            case 4:
                return new Square();
            default:
                return null;
        }
    }
}
