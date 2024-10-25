package baseModel;

import enums.PersonGroup;

abstract public class Person {

    private String name;

    private PersonGroup personGroup;

    public Person(String name, PersonGroup personGroup) {
        this.name = name;
        this.personGroup = personGroup;
    }

    public String getName() {
        return name;
    }

    public PersonGroup getPersonGroup() {
        return personGroup;
    }

    public abstract int getPriority();
}


