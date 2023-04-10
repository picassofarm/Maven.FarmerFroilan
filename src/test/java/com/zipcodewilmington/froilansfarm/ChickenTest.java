package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void eatTest(){
        Chicken chicken = new Chicken();
        Corn corn = new Corn();
        String expected = "Cluck cluck (This means that was some delicious corn.)";

        String actual = chicken.eat(corn);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceTest(){
        Chicken chicken = new Chicken();

        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void yieldTest(){
        Chicken chicken = new Chicken();

        Egg egg = chicken.yield(true);
        Assert.assertTrue(egg instanceof Egg);
    }

}
