package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void eatTest(){
        Horse horse = new Horse();
        Corn corn = new Corn();
        String expected = "NEEIIIIIGH (This means that the corn was bussin')";

        String actual = horse.eat(corn);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceTest(){
        Horse horse = new Horse();

        Assert.assertTrue(horse instanceof Rideable);
    }
}
