package factory;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle; 

public class ShapeFactory {
    public Shape getShape ( ShapesEnum desiredShape )  throws Exception{ 
     if (desiredShape == ShapesEnum.Rectangle) { 
        return new Rectangle () ; 
     }
     else if (desiredShape == ShapesEnum.Triangle) { 
        return new Triangle() ; 
     }
     else  if (desiredShape == ShapesEnum .Circle) { 
        return new Circle() ; 
     }
     else if (desiredShape == ShapesEnum.Square) {
        return new Square() ; 
     }
     else {
        throw new  Exception( "Wrong Shape Enum value ") ; 
     }
    }
}
