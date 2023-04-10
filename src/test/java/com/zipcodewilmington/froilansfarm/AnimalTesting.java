package com.zipcodewilmington.froilansfarm;


import org.junit.Assert;
import org.junit.Test;


public class AnimalTesting {
    @Test
    public void animalTest(){
        Animal animal = new Animal();
        Assert.assertTrue(animal instanceof Eater);
    }

    @Test
    public void animalTest1(){
        Animal animal = new Animal();
        Assert.assertTrue(animal instanceof NoiseMaker);
    }

}
