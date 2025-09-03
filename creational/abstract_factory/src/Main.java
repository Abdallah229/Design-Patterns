import Factory.AbstractFactory;
import Shape.Shape ;
public class Main {
    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer() ;

        AbstractFactory factory = factoryProducer.getFactory("NORMAL");

        Shape shape = factory.getShape("SQUARE") ;
        shape.draw();

        shape =  factory .getShape("RECTANGLE") ;
        shape.draw();

        factory =factoryProducer.getFactory("ROUNDED") ;
        shape = factory .getShape("SQUARE") ;
        shape.draw();

        shape = factory .getShape("RECTANGLE") ;
        shape.draw();




    }
}