public class Rectangle extends Shape {

    Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside the Rectangle :: draw() function");
    }

}
