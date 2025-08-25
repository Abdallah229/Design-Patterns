import Person.Person;
import Criteria.* ;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    List<Person>  persons = new ArrayList<Person>() ;
    persons.add(new Person("Mego 5wal" , "Female" , "Single")) ;
    persons.add(new Person("Ahmed" , "Male" , "Married")) ;
    persons.add(new Person("Ramage" , "Female" , "Single")) ;
    persons.add(new Person("Omnia" , "Female" , "Married")) ;
    persons.add(new Person("Abdallah" , "Male" , "Single")) ;
    persons.add(new Person("Mohamed" , "Male" , "Married")) ;

    Criteria criteria = new OrCriteria(new CriteriaFemale() , new CriteriaSingle()) ;
    List <Person > result = criteria.meetCriteria(persons);
        for (final Person person : result ) {
            System.out.println(" Name : " + person .getName() + ", Gender : " + person.getGender() + ", Marital Status : "  + person.getMaritalStatus() + "\n") ;
        }
    }


}