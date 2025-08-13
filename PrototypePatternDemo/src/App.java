public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n            Prototype Design patten         \n\n");


        ShapeCache.loadCache();

        System.out.println("\nCloning a square : ");
        Shape clonedSquare = ShapeCache.getShape("2");
        clonedSquare.draw();

        System.out.println("\nCloning a circle :");
        Shape clonedCircle = ShapeCache.getShape("1");
        clonedCircle.draw();

        System.out.println("\nCloning a rectangle :");
        Shape clonedRectangle = ShapeCache.getShape("3") ; 
        clonedRectangle.draw(); 

    }
}
