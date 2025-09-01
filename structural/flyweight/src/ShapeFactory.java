import Shape.*;

import java.util.HashMap;

public class ShapeFactory {
    private  static  final HashMap<Object, Object> circlesMap = new HashMap<>() ;

    public static  Shape  getCircle (String color){
        Circle circle = (Circle) circlesMap.get(color) ;

        if (circle ==null) {
            circle = new Circle(color ) ;
            circlesMap.put(color , circle) ;
            System.out .println("Creating a circle of color : " + color );
        }
        return  circle ;
     }
}
