package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.MissingFormatArgumentException;

public class PilotTest {
    @Test
    public void instanceTest(){
        Pilot pilot = new Pilot();

        Assert.assertTrue(pilot instanceof Rider);
    }

    @Test
    public void mountTest(){
        Pilot pilot = new Pilot();
        Horse horse = new Horse();

        boolean expected = true;
        boolean actual = pilot.mount(horse);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountWhileMountedTest(){
        Pilot pilot = new Pilot();
        Horse horse = new Horse();
        pilot.mount(horse);

        boolean expected = true;
        boolean actual = pilot.mount(horse);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        Pilot pilot = new Pilot();
        Horse horse = new Horse();
        pilot.mount(horse);

        boolean expected = false;
        boolean actual = pilot.dismount(horse);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dismountWhileNotMountedTest(){
        Pilot pilot = new Pilot();
        Horse horse = new Horse();

        boolean expected = false;
        boolean actual = pilot.dismount(horse);

        Assert.assertEquals(expected, actual);
    }
}
