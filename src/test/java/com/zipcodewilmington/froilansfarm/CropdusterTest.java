package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CropdusterTest extends TestCase {

    @Test
    public void instanceTest(){
        Cropduster cropduster = new Cropduster();
        Assert.assertTrue(cropduster instanceof Rideable);

    }

    @Test
    public void flying(){
        Cropduster cropduster = new Cropduster();
        String result = cropduster.Fly();
        String expected = "Nyyyyyyyuuuuummmmm";
        Assert.assertEquals(expected, result);

    }


}