package BridgeImplementor;

public class RedCircle  implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing a circle : { color : red , radius : " + radius  + " , x : " + x + " , y : " + y + " } ");
    }
}
