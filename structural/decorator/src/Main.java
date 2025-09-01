import Decorator.RedShapeDecorator;
import Decorator.ShapeDecorator;
import Shape.Circle;

public class Main {
    public static void main(String[] args) {

        ShapeDecorator redDecorator = new RedShapeDecorator(new Circle()) ;

        redDecorator .draw () ;
    }
}