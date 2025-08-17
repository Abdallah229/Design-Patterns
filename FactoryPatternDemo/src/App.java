
import factory.*;

import shapes.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Factory Design pattern demo ");
        ShapeFactory shapeFactory = new ShapeFactory();

        /// Expected output : "Triangle Drawn"
        Shape triangle = shapeFactory.getShape(ShapesEnum.Triangle);
        triangle.draw();
        /// Expected output : "Circle Drawn"
        Shape circle = shapeFactory.getShape(ShapesEnum.Circle);
        circle.draw();
    }
}
