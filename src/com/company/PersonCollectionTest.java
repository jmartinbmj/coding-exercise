package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class PersonCollectionTest {
    private static PersonCollection collection = new PersonCollection();

    @BeforeAll
    static void initialize()
    {
        try {
            collection.AddPerson(new Person("oldest", Sex.Female, "99/99/9999"));
            collection.AddPerson(new Person("Male2", Sex.Male, "00/00/0000"));
            collection.AddPerson(new Person("Male1", Sex.Male, "00/00/0000"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Test
    void getAllOfSex() {
        assertEquals(collection.getAllOfSex(Sex.Male).length, 2);
    }

    @Test
    void getOldest() {
        try {
            assertEquals(collection.getOldest().getName(), "oldest");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}