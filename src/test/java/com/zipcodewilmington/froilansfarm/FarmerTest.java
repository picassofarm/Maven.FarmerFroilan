package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void plantTest(){
        Farmer farmer = new Farmer();
        CornStalk cornStalk = new CornStalk();
        CropRow row = new CropRow();
        CropRow planted = new CropRow();
        planted = farmer.plant(row, cornStalk);


        Assert.assertNotNull(planted);
    }

    @Test
    public void instanceTest(){
        Farmer farmer = new Farmer();

        Assert.assertTrue(farmer instanceof Rider);
    }

    @Test
    public void instanceTest2(){
        Farmer farmer = new Farmer();

        Assert.assertTrue(farmer instanceof Botanist);
    }

    @Test
    public void mountTest(){
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        boolean expected = true;
        boolean actual = farmer.mount(horse);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void mountWhileMountedTest(){
        Farmer farmer = new Farmer();
        Horse horse = new Horse();
        farmer.mount(horse);

        boolean expected = true;
        boolean actual = farmer.mount(horse);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest(){
        Farmer farmer = new Farmer();
        Horse horse = new Horse();
        farmer.mount(horse);

        boolean expected = false;
        boolean actual = farmer.dismount(horse);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountWhileNotMountedTest(){
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        boolean expected = false;
        boolean actual = farmer.dismount(horse);

        Assert.assertEquals(expected, actual);
    }
}
