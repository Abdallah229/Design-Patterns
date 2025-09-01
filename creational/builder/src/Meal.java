import item.*;
import java.util.*;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.name() + " has been added to the meal");
    }

    public float getPrice() {
        float result = 0;
        for (Item item : items) {
            result += item.price();
        }
        return result;
    }

    public void showItems() {
        System.out.println();
        System.out.println("Displaying the meal items : ");
        for (Item item : items) {
            System.out.print("Item : " + item.name() + "    ");
            System.out.print("Packing : " + item.packing().pack() + "    ");
            System.out.println("Price : " + item.price());
        }
        System.out.println("");
    }
}
