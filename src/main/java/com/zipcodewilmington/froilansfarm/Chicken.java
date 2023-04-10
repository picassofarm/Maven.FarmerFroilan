package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal<Corn> implements Produce<Egg>{
    Egg egg = new Egg();
    public Egg yield(boolean hasBeenFertilized){
        return new Egg();
    }

    @Override
    public String eat(Object food) {
        super.eat(food);
        return "Cluck cluck (This means that was some delicious corn.)";
    }
}
