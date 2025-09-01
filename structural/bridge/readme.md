# Bridge Pattern Example (Java)

## 📖 Overview
The **Bridge Pattern** is a structural design pattern that decouples an abstraction from its implementation, so that the two can vary independently.

In this example, the **abstraction** is the `Shape` class, and the **implementations** are different ways of drawing circles (`RedCircle`, `YellowCircle`).

---
## UML Diagram

```mermaid
classDiagram
    class DrawAPI {
        +drawCircle(int radius, int x, int y)
    }

    class RedCircle {
        +drawCircle(int radius, int x, int y)
    }

    class YellowCircle {
        +drawCircle(int radius, int x, int y)
    }

    DrawAPI <|.. RedCircle
    DrawAPI <|.. YellowCircle

    class Shape {
        #DrawAPI drawAPI
        +draw()
    }

    class Circle {
        -int radius
        -int x
        -int y
        +draw()
    }

    Shape <|-- Circle
    Shape o-- DrawAPI
---

## 📂 Code Structure

### Implementor Interface
```java
package BridgeImplementor;

public interface DrawAPI {
    public void drawCircle(int radius, int x, int y);
}
```

### Concrete Implementors
```java
package BridgeImplementor;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing a circle { color : red, radius : " + radius + " , x : " + x  + " , y : " + y + " } ");
    }
}
```
```java
package BridgeImplementor;

public class YellowCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing a circle { color : yellow, radius : " + radius + " , x : " + x  + " , y : " + y + " } ");
    }
}
```

### Abstraction
```java
import BridgeImplementor.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI api) {
        this.drawAPI = api;
    }

    public abstract void draw();
}
```

### Refined Abstraction
```java
import BridgeImplementor.DrawAPI;

public class Circle extends Shape {
    private final int radius;
    private final int x;
    private final int y;

    public Circle(int radius, int x, int y, DrawAPI drawingAPI) {
        super(drawingAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
```

### Client Code
```java
import BridgeImplementor.*;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape yellowCircle = new Circle(200, 200, 20, new YellowCircle());

        redCircle.draw();
        yellowCircle.draw();
    }
}
```

---

## ✅ Key Points
- **Abstraction (`Shape`)**: Defines the high-level control logic.
- **Implementor (`DrawAPI`)**: Defines the low-level drawing API.
- **Concrete Implementors (`RedCircle`, `YellowCircle`)**: Provide different implementations.
- **Refined Abstraction (`Circle`)**: Connects abstraction with implementation.

---

## UML Diagram
```
     Shape (abstraction)
          |
          v
       Circle (refined abstraction)
          |
   -------------------
   |                 |
DrawAPI (interface)  |
   |                 |
   v                 |
RedCircle        YellowCircle
```

---

## 🎯 When to Use the Bridge Pattern?
- When you want to avoid a permanent binding between abstraction and implementation.
- When abstraction and implementation should vary independently.
- To prevent an explosion of classes (e.g., ShapeRedCircle, ShapeYellowCircle, etc.).
