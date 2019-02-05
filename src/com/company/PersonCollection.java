package com.company;

import java.text.ParseException;
import java.util.Vector;

public class PersonCollection {
    Vector<Person> collection = new Vector<Person>();

    public void AddPerson(Person person)
    {
        collection.add(person);
    }

    public Person[] getAllOfSex(Sex sex)
    {
        Vector<Person> query = new Vector<Person>();

        // probably better way
        for (Person person : collection)
            if (person.getSex() == sex)
                query.add(person);

        Person[] tmp = new Person[query.size()];
        query.toArray(tmp);
        return tmp;
    }

    public Person getOldest() throws ParseException {
        Person oldest = new Person("n/a", Sex.Female, "00/00/0000");

        for (Person person : collection)
        {
            if (!oldest.isOlderThan(person.getDateofbirth()))
                oldest = person;
        }

        return oldest;
    }
}
