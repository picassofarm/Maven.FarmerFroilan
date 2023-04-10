package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void eatTest(){
        Person person = new Person();
        Corn corn = new Corn();
        String expected = "Yum that was a delicious " + corn.toString();

        String actual = person.eat(corn);
        Assert.assertEquals(expected, actual);
    }
}
