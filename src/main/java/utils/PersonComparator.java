package utils;

import baseModel.Person;
import enums.PersonGroup;
import model.Student;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1 instanceof Student && p2 instanceof Student) {
//            if (((Student) p1).getLevel() == ((Student) p2).getLevel()) return 0;
            return Integer.compare(((Student) p2).getLevel(), ((Student) p1).getLevel());

//        } else if (p1.getPersonGroup() == PersonGroup.TEACHER && p2.getPersonGroup() == PersonGroup.STUDENT) {
//            return -1;
//        } else if (p1.getPersonGroup() == PersonGroup.STUDENT && p2.getPersonGroup() == PersonGroup.TEACHER) {
//            return 1;
//        }
//        return 0;
        } else  {
            return Integer.compare(((Person) p1).getPriority(), ((Person) p2).getPriority());
        }
    }

}
