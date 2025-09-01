package Decorator;

import Shape.Shape;

public class RedShapeDecorator  extends  ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    private  void setRedBorder (Shape decoratedShape) {
        System.out .println("Border color : Red ");
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shape);
    }
}
