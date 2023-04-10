package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {
    @Test
    public void instanceTest(){
        Pilot pilot = new Pilot();

        Assert.assertTrue(pilot instanceof Rider);
    }
}
