package model;

import baseModel.Person;
import enums.PersonGroup;

public class Teacher extends Person {

    public Teacher(String name, PersonGroup personGroup) {
        super(name, personGroup);
//        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "priority=" + getPriority() +
                '}';
    }


}
