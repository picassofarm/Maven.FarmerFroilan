package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CropdusterTest{

    @Test
    public void instanceTest(){
        Cropduster cropduster = new Cropduster();
        Assert.assertTrue(cropduster instanceof Rideable);

    }

    @Test
    public void TestMakeNoise() {
        Cropduster cropduster = new Cropduster();
        Assert.assertEquals("Vroom", cropduster.makeNoise());
    }

    @Test
    public void TestFly() {
        CropRow expected = new CropRow();
        Cropduster cropduster = new Cropduster();
        cropduster.fly(expected);

        CropRow actual = cropduster.cropRow;

        Assert.assertEquals(expected, actual);


    }

}