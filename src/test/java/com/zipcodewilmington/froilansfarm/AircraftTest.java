package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AircraftTest extends TestCase {
    @Test
    public void AircraftTest() {

        Aircraft aircraft = new Aircraft();
        Assert.assertTrue(aircraft instanceof Vehicle);
    }


}