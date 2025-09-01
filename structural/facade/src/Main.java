
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker() ;

        System.out.println("Drawing a circle");
        shapeMaker.drawCircle();

        System.out.println("Drawing a rectangle");
        shapeMaker.drawRectangle();

        System.out.println("Drawing a square");
        shapeMaker.drawSquare();
    }
}