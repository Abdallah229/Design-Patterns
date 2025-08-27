package GeekImplemetation;

import java.util.*;

public class Supervisor  extends   Employee{

    private final List<Employee> subordinates ;

    public Supervisor(String name, String department, double salary) {
        super(name, department, salary);
        subordinates = new ArrayList<Employee>() ;
    }

    @Override
    public void add (Employee employee  ){
        subordinates .add( employee) ;
        System.out .println("Employee added for supervisor : " + name  );
    }


    @Override
    public void remove (Employee employee) {
        subordinates.remove(employee) ;
        System.out.println("Employee removed for supervisor :  "+ name );
    }

    @Override
    public List <Employee> getSubordinates () {
        return  this.subordinates ;
    }

}
