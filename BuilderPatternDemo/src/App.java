public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Builder design pattern");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        MealBuilder ourBuilder = new MealBuilder() ; 
        Meal currentMeal = ourBuilder .prepareVegMeal() ; 
        currentMeal .showItems(); 
        /// trying to build the nonVegMeal
        currentMeal = ourBuilder.prepareNonVegMeal() ; 
        currentMeal .showItems();
    }
}
