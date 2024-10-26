package model;

import baseModel.Person;
import enums.PersonGroup;

public class Student extends Person {
    private int level;

    public Student(String name, PersonGroup personGroup, int level) {
        super(name, personGroup);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public String toString() {
        return "Student " + this.getName() + ", level=" + level + ", priority=" + getPriority();
    }

}
