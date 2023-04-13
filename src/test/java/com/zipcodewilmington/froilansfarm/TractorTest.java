package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest extends TestCase {
    @Test
    public void instanceTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);
    }
    @Test
    public void MakeNoise() {
        Tractor tractor = new Tractor();
        Assert.assertEquals("Vroom", tractor.makeNoise());
    }
}
