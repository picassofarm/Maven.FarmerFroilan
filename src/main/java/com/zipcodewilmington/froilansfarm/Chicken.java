package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal<Corn> implements Produce<Egg>{
    Egg egg = new Egg();
    public Egg yield(boolean hasBeenFertilized){
        return new Egg();
    }
}
