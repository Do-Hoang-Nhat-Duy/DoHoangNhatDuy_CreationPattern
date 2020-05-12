
package bt3.shape.Triangle;

import bt3.shape.Shape;


public class ShapeTriangle extends Shape{
    private static ShapeTriangle instance;
    protected ShapeTriangle() {
    }
    
    public static ShapeTriangle createInstance(){
        if(instance == null)
            instance = new ShapeTriangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Ve hinh tam giac!!!";
    }

}
