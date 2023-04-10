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
}
