package Criteria;

import Person.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> males = new ArrayList<Person>() ;
        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                males .add(person) ;
            }
        }
        return  males ;
    }
}
