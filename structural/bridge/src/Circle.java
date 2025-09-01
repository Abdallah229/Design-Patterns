import BridgeImplementor.DrawAPI;

public class Circle extends  Shape{
     private final int radius  ;
     private final int x ;
     private final int y ;

     public  Circle (int radius , int x , int y , DrawAPI drawingAPI)  {
         super(drawingAPI);

         this.radius = radius ;
         this.x = x ;
         this.y = y ;
     }

    @Override
    public void draw() {
         drawAPI.drawCircle(radius , x , y );
    }
}
