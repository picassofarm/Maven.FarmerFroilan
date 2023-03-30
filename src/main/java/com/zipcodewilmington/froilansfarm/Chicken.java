package com.zipcodewilmington.froilansfarm;

public class Chicken implements Produce{
    Egg egg = new Egg();
    public Egg yield(boolean hasBeenFertilized){
        return new Egg();
    }
}
