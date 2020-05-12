
package bt3.shape.rectangle;

import bt3.shape.Shape;

public class ShapeRectangle extends Shape{
        private static ShapeRectangle instance;
    protected ShapeRectangle() {
    }
    
    public static ShapeRectangle createInstance(){
        if(instance == null)
            instance = new ShapeRectangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Ve hinh vuong!!!";
    }

}
