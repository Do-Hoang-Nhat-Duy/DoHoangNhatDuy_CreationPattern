
package bt3.shapefactory;

import bt3.shape.Shape;
import bt3.shape.ShapeType;
import bt3.shape.Triangle.ShapeTriangle;
import bt3.shape.circle.ShapeCircle;
import bt3.shape.rectangle.ShapeRectangle;

public class ShapeFactory {
    public Shape createShape(ShapeType type){
        switch(type){
            case rectangle: return ShapeRectangle.createInstance();
            case triangle: return ShapeTriangle.createInstance();
            case circle: return ShapeCircle.createInstance();
        }
        return null;
    }
}
