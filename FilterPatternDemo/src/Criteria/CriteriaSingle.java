package Criteria;

import Person.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> singles =  new ArrayList<Person>() ;
        for (final  Person person : people  ){
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE") ) {
                singles.add(person) ;
            }
        }
        return  singles ;
    }
}
