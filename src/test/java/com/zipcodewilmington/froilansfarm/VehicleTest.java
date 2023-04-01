package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class VehicleTest extends TestCase {
    @Test
    public void VehicleTest() {

    Vehicle vehicle = new Vehicle();
    Assert.assertTrue(vehicle instanceof Rider);
}

    @Test
    public void NoiseMaker() {
        Vehicle <Rider> vehicle = new Vehicle<>();
        String expectedSound = "vroom";
        String actualSound = vehicle.makeNoise();
        assertEquals(expectedSound, actualSound);
    }
}