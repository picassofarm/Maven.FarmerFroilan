package com.zipcodewilmington.froilansfarm;

import jdk.internal.org.jline.reader.Editor;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTesting {
    @Test
    public void animalTest(){
        Animal animal = new Animal();
        Assert.assertTrue(animal instanceof Edible);
    }
}
