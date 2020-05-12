
package bt3;

import bt3.shape.Shape;
import bt3.shape.ShapeType;
import bt3.shapefactory.ShapeFactory;

public class Main3 {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        
        //Ve 2 hinh tron
        Shape s1 = sf.createShape(ShapeType.circle);
        Shape s2 = sf.createShape(ShapeType.circle);
        
        //Ve 2 hinh vuong
        Shape s3 = sf.createShape(ShapeType.rectangle);
        Shape s4 = sf.createShape(ShapeType.rectangle);
        
        //Ve 2 hinh tam giac
        Shape s5 = sf.createShape(ShapeType.triangle);
        Shape s6 = sf.createShape(ShapeType.triangle);
        
        s1.setBienDem(10);
        s2.setBienDem(5);
        
        s3.setBienDem(15);
        s4.setBienDem(20);
        
        s5.setBienDem(35);
        s6.setBienDem(30);
        
        System.out.println("Shape 1 co so la: "+s1.getBienDem());
        System.out.println("Shape 2 co so la: "+s2.getBienDem());
        System.out.println("Shape 3 co so la: "+s3.getBienDem());
        System.out.println("Shape 4 co so la: "+s4.getBienDem());
        System.out.println("Shape 5 co so la: "+s5.getBienDem());
        System.out.println("Shape 6 co so la: "+s6.getBienDem());
    }
    
}
