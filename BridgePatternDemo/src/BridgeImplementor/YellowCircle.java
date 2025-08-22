package BridgeImplementor;

public class YellowCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing a circle { color : yellow  , radius : " + radius + " , x : " + x  + " , y : " + y + " } "  );
    }
}
