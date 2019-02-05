package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Sex sex;
    private Date dateofbirth;

    Person(String name, Sex sex, String dateofbirth) throws ParseException {
        setName(name);
        setSex(sex);
        setDateofbirth(dateofbirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        dateofbirth = format.parse(date);
    }

    public boolean isOlderThan(Date date) throws ParseException {
        return dateofbirth.after(date);
    }
}
