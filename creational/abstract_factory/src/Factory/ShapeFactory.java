package Factory;

import Shape.*;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase ("SQUARE")) {
            return new  Square () ;
        }
        else if (shapeType .equalsIgnoreCase("RECTANGLE")) {
            return  new Rectangle() ;
        }
        else {
            return  null ;
        }
    }
}
