package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropSectionTests {

    @Test
    public void testCornYield(){
        CornStalk corn = new CornStalk();

        Assert.assertTrue(corn.yield(true) instanceof Corn);
        Assert.assertNull(corn.yield(false));
    }

    @Test
    public void testTomatoYield() {
    }
}
