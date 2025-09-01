import item.*;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal result = new Meal();
        result.addItem(new VegBurger());
        result.addItem(new Coke());
        return result;
    }

    public Meal prepareNonVegMeal() {
        Meal result = new Meal();
        result.addItem(new ChickenBurger());
        result.addItem(new Pepsi());
        return result;
    }

}
