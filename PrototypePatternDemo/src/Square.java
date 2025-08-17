public class Square extends Shape {
    

    Square () {
        type = "Square" ; 
    }


    @Override
    public void draw() {
        System.out.println("Inside the Square :: draw () function");
    }

}
