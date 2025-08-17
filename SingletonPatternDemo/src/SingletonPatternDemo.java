// import SingleObject ; 

public class SingletonPatternDemo {

    private static void wrongAccess() {
        /// Trying to access the SingleObject class using
        /// the new keyword
        try {

            // SingleObject singleObject = new SingleObject();
        } catch (Exception e) {
            System.out.println(e);
            /// The expected error :
            /// "The constructor SingleObject() is not visible"
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println("In Singleton Design Pattern");
        
        ///Remember to remove the comments from the wrong line
        /// in the wrongAccess function
        wrongAccess () ; 

        /// The only way of access the print function is by
        /// the instance property
        SingleObject.getInstance().print();
    }
}
