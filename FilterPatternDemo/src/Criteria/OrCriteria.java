package Criteria;

import Person.Person;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria
{
     private  Criteria criteria ;
     private  Criteria otherCriteria ;

     public  OrCriteria(Criteria criteria , Criteria otherCriteria ) {
         this.criteria = criteria ;
         this.otherCriteria = criteria ;
     }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(people) ;
        List<Person> otherCriteriaItems = otherCriteria .meetCriteria(people);

        for (final  Person person : firstCriteriaItems){
            if (! otherCriteriaItems.contains(person) ) {
                otherCriteriaItems.add(person);
            }
        }
      return   otherCriteriaItems ;
    }
}
