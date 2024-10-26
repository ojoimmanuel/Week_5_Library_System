package utils;

import baseModel.Person;
import model.Student;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1 instanceof Student && p2 instanceof Student) {
            return Integer.compare(((Student) p2).getLevel(), ((Student) p1).getLevel());
        } else  {
            return Integer.compare(((Person) p1).getPriority(), ((Person) p2).getPriority());
        }
    }

}
