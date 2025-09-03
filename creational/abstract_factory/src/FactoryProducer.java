import Factory.*;

public class FactoryProducer {

    public AbstractFactory getFactory (String factoryType) {
        if (factoryType .equalsIgnoreCase("ROUNDED")) {
            return  new RoundedShapeFactory() ;
        }
        else if (factoryType.equalsIgnoreCase("NORMAL")) {
            return  new ShapeFactory() ;
        }
        else {
            return  null ;
        }
    }
}
