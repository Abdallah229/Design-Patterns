public class SingleObject {

    /// The instance to access the class
    private static SingleObject instance = new SingleObject();

    /// Mark the contractor as private
    private SingleObject() {
    }
    
    ///The only way to access the class from the outside 
    /// is using the getInstance function
    public static  SingleObject getInstance() {
        return instance;
    }


    public  void print() {
        System.out.println("Done singleton pattern");
    }
}
