
package bt3.shape.circle;

import bt3.shape.Shape;

public class ShapeCircle extends Shape{

    private static ShapeCircle instance;
    protected ShapeCircle() {
    }
    
    public static ShapeCircle createInstance(){
        if(instance == null)
            instance = new ShapeCircle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Ve hinh tron!!!";
    }
    
}
