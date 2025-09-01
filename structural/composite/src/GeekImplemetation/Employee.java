package GeekImplemetation;

import java.util.List;

public abstract class Employee {
  protected  String name ;
  protected  String department ;
  protected  double salary ;

  protected Employee(String name , String department , double salary ) {
      this.salary = salary ;
      this.department = department ;
      this.name = name ;
  }
  public    void add (Employee employee ) {
      throw new UnsupportedOperationException();
  }
  public    void remove ( Employee employee){
      throw new UnsupportedOperationException() ;

  }

  public   List<Employee> getSubordinates ()  {
      throw  new UnsupportedOperationException( );
  }

    @Override
  public String toString () {
      return  "Employee : [ Name : " + name + " , Department : " + department + " , Salary " + salary + " ] " ;
  }
}
