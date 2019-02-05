package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {

        try {
            PersonCollection collection = new PersonCollection();
            collection.AddPerson(new Person("Jack Martin1", Sex.Male, "18/10/1997"));
            collection.AddPerson(new Person("Jack Martin2", Sex.Female, "17/10/1997"));
            collection.AddPerson(new Person("Jack Martin3", Sex.Female, "16/10/1997"));

            for (Person person : collection.getAllOfSex(Sex.Female))
                System.out.println(person.getName());

            System.out.println(collection.getOldest().getName());

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
