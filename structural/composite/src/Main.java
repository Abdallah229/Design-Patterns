import GeekImplemetation.Employee;
import GeekImplemetation.Subordinate;
import GeekImplemetation.Supervisor;

public class Main {
    public static void main(String[] args) {
        Employee ahmed  = new Subordinate("ahmed" , "is" , 2000) ;
        Employee hoda  = new Subordinate("hoda" , "is" , 4000) ;
        Employee marwa  = new Subordinate("marwa" , "is" , 4000) ;
        Employee amgad  = new Subordinate("amgad" , "is" , 8000) ;
        Supervisor mohamed  = new Supervisor("mohamed" , "IS" , 10000) ;
        mohamed.add(ahmed);
        mohamed.add(hoda);
        mohamed.add(marwa);
        mohamed.add(amgad);
        for (final  Employee subordinate : mohamed.getSubordinates()) {
           System.out.println( subordinate.toString() ) ;
        }
    }
}