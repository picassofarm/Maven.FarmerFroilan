package com.zipcodewilmington.froilansfarm;

public class Animal <EatType extends Edible> implements Eater, NoiseMaker{
    public void eat(Object food) {}
}
