import BridgeImplementor.*;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100 , 100 , 10 ,new RedCircle() ) ;

        Shape yellowCircle = new Circle(200 , 200 , 20 , new YellowCircle() ) ;


        redCircle.draw();
        yellowCircle.draw();
    }
}