package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Horse extends Animal<Corn> implements Rideable<Rider>{
    @Override
    public String eat(Object food) {
        super.eat(food);
        return "NEEIIIIIGH (This means that the corn was bussin')";
    }
}
