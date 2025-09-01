package Decorator;

import Shape.Shape;

public abstract class ShapeDecorator {

    protected Shape shape  ;

    public  ShapeDecorator(Shape shape ) {
        this.shape = shape ;
    }
   public  void draw () {
        shape.draw();
    }

}
